package com.java.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestExample {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola";
    }
    
}
