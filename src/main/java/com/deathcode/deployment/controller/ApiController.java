package com.deathcode.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/deployment/api")
public class ApiController {

    @GetMapping(path = "/health")
    public String healthCheck()
    {
        return "Your Application is Running fine ✔ ,  Continue your work !!!";
    }
}
