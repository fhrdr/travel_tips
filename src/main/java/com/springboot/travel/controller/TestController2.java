package com.springboot.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController2 {

    @GetMapping("/hello2")
    public String hello(){
        return "hello";
    }

}
