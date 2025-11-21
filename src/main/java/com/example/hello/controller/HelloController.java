package com.example.hello.controller;

import com.example.hello.dto.Hello;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello hello(@RequestParam(name = "name", defaultValue = "world") String name) {
        if (name == null) {
            throw new IllegalArgumentException("Param 'name' nie może być null");
        }
        // prosty przykład - można tu dodać walidację długości, znaki itp.
        return new Hello("hello you " + name);
    }
}
