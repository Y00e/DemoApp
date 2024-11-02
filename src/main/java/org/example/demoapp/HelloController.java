package org.example.demoapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "https://y00e.github.io")
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
