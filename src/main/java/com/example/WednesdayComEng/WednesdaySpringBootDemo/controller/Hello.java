package com.example.WednesdayComEng.WednesdaySpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String Hello(){
        return "Hello World!";
    }


}
