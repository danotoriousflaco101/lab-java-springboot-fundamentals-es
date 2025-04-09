package com.example.SpringbootFundamentalsLab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Greeting controller
@RestController
@RequestMapping("/hello")
public class GreetingController {

    // returns a generic greeting message
    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    // returns a perzonalized greeting message using a path variable
    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // returns the sum of 2 values
    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    // returns product of 2 numbers, multiply them
    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }
}