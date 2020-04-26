package com.sunnytech.in.restweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminMadeController {


    @GetMapping("/enter/homeMade")
    public String entryHomeMade()
    {
        System.out.println("Printed /enter/homeMade");
        return "Sunny";
    }


}
