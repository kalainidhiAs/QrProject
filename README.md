Real-Time Identity Vault

This Spring Boot web application allows users to submit personal details through a form. Upon submission, it generates a QR code linked to a URL where the person's data can be viewed in plain HTML. The system stores the data in a database and provides both API and web-based access to the details.

## 📌 Features

- 📄 Web form to collect personal details
- 📦 Stores data in a relational database (MySQL)
- 🔗 Generates a unique QR code for each person
- 📱 Scanning the QR code opens a webpage with person details
- 🖥️ View page displays submitted data with an embedded QR image
- 🧾 REST API endpoints for programmatic access

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **QRCode Generator (ZXing.Javasse)**
- **MySQL Database**
- **Maven**

## 🗃️ Folder Structure

src/
├── main/
│ ├── java/
│ │ └── com.snapident.sid/
│ │ ├── controller/ # Spring Controllers
│ │ ├── model/ # Person Entity
│ │ ├── repository/ # JPA Repositories
│ │ └── util/ # QR Code Generator Utility
│ ├── resources/
│ │ ├── static/ #  CSS, JS
│ │ │ └── qrcodes/ # QR code images storage
│ │ ├── templates/ # Thymeleaf templates (form.html, view.html)
│ │ └── application.properties / application.yml
└── ...
