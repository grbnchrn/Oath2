package com.bank.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class WelcomeController {

    @GetMapping
    public String createWelcomeMessage(){
        return "Welcome to Application";
    }
}
