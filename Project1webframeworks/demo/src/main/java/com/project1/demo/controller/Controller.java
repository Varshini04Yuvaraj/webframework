package com.project1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/demo")
    public String message()
    {
        return "Hello Varshini Yuvaraj";
    }
}
