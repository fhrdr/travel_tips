package com.springboot.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
