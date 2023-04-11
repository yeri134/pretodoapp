package com.example33333.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResponseTest {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
