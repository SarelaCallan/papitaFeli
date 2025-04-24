package com.papita.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")

public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola desde Spring Boot!";
    }
}


