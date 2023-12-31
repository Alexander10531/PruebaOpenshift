package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PruebaController {

    @GetMapping("/prueba")
    public String pruebaPing(){
        return "Alexander";
    }

}