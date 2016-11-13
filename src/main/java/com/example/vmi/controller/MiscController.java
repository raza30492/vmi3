/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.vmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author razamd
 */
@Controller
public class MiscController {
    
    @RequestMapping(path = {"/", "/home"})
    public String homePage(){
        System.out.println("Inside homePage");
        return "index";
    }
}
