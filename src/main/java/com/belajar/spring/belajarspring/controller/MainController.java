package com.belajar.spring.belajarspring.controller;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/")
    public String home(){
        return "Belajar spring boot";
    }

}
