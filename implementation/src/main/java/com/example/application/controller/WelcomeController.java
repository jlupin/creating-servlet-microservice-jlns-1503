package com.example.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class WelcomeController {
    @CrossOrigin
    @PostMapping(value = "/getWelcomeMessage")
    public Map<String, String> getWelcomeMessage(@RequestBody Map<String, String> map) {
        return Collections.singletonMap("message", "Hello " + map.get("name") + "!");
    }
}