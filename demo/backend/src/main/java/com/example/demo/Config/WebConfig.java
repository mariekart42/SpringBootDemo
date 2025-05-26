package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Erlaubt CORS für alle Endpunkte
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")  // Dein Frontend-URL
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Die erlaubten HTTP-Methoden
                .allowedHeaders("*") // Erlaubt alle Header
                .allowCredentials(true); // Erlaubt die Nutzung von Cookies, falls benötigt
    }
}