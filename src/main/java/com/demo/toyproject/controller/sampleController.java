package com.demo.toyproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @Value("${credentials.very-sensitive-data}")
    private String verySensitiveData;

    @GetMapping("/credentials")
    public void printCredentials() {
        System.out.println("verySensitiveData = " + verySensitiveData);
    }
}
