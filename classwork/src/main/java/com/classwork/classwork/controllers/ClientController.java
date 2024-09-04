package com.classwork.classwork.controllers;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/api/v1/printhello")
    public String printHello() {
        return "Hello World";
    }


}
