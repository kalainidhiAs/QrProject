package com.snapident.sid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Maps /qrcodes/** to local file system directory ./qr-uploads/
        registry.addResourceHandler("/qrcodes/**")
                .addResourceLocations("file:./qr-uploads/");
    }
}
