package com.snapident.sid.controller;

import com.snapident.sid.model.Person;
import com.snapident.sid.repository.PersonRepository;
import com.snapident.sid.util.QRCodeGenerator;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class HomeController {

    @Autowired
    private PersonRepository personRepository;

    // Show form
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @PostMapping("/form/submit")
    public String submitForm(@ModelAttribute Person person, Model model) {
        Person saved = personRepository.save(person);

        String qrText = "http://localhost:8080/person/view/" + saved.getId();
        String sanitizedFullName = saved.getFullName().replaceAll("[^a-zA-Z0-9]", "_");
        String fileName = "person_" + saved.getId() + "_" + sanitizedFullName + ".png";

        // ✅ Save to src/main/resources/static/qrcodes/
        String staticDir = new File("src/main/resources/static/qrcodes").getAbsolutePath();
        new File(staticDir).mkdirs(); // ensure directory exists
        String qrAbsolutePath = staticDir + File.separator + fileName;

        try {
            QRCodeGenerator.generateToFile(qrText, qrAbsolutePath);

            // ✅ This path is served to the browser
            String qrWebPath = "/qrcodes/" + fileName;

            model.addAttribute("message", "Saved & QR Code Generated!");
            model.addAttribute("person", saved);
            model.addAttribute("qrPath", qrWebPath);

            return "view";
        } catch (Exception e) {
            model.addAttribute("message", "QR generation failed: " + e.getMessage());
            return "form";
        }
    }

    // Render view.html using Thymeleaf
    @GetMapping("/view/{id}")
    public String viewPerson(@PathVariable Long id, Model model) {
        return personRepository.findById(id)
                .map(person -> {
                    String sanitizedFullName = person.getFullName().replaceAll("[^a-zA-Z0-9]", "_");
                    String qrPath = "/qrcodes/person_" + person.getId() + "_" + sanitizedFullName + ".png";

                    model.addAttribute("person", person);
                    model.addAttribute("qrPath", qrPath);
                    return "view";
                })
                .orElse("redirect:/person/form?error=notfound");
    }

    @GetMapping("/")
    public String redirectToForm() {
        return "redirect:/person/form";
    }
}
