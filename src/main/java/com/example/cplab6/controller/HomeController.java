package com.example.cplab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/loginForm"})
    public String loginForm(){return "loginForm";}
}
