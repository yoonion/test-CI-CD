package com.ggom.gitaction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${app.version}")
    String version;

    @GetMapping("/")
    public String home() {
        return "Hello CICD! version: " + version;
    }
}

