package com.in.demo.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping(value = "test")
    public String demoTest()
    {
        return  "Sunny";
    }

}
