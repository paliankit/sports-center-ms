package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sports")
public class SportsCenterController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome !!";
    }
}
