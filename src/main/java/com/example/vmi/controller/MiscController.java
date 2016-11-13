package com.example.vmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiscController {
    
    @RequestMapping(path = {"/", "/home"})
    public String homePage(){
        System.out.println("Inside homePage");
        return "index";
    }
}
