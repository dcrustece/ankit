package com.welcome.welcome.com.welcome.welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "welcome to new world";
        }

}
