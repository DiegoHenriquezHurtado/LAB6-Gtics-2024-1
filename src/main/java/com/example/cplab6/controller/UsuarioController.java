package com.example.cplab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    @GetMapping(value = {"/Admin"})
    public String vistaAdmin(){
        return "/vistaPrincipal";
    }
}
