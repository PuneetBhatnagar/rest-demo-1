package com.example.restdemo.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
