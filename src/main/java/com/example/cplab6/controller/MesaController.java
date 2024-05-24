package com.example.cplab6.controller;

import com.example.cplab6.repository.MesasRepository;
import com.example.cplab6.repository.UsuariosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MesaController {
    final MesasRepository mesasRepository;
    final UsuariosRepository usuariosRepository;

    public MesaController(MesasRepository mesasRepository,UsuariosRepository usuariosRepository){
        this.mesasRepository = mesasRepository;
        this.usuariosRepository = usuariosRepository;
    }

    @GetMapping(value = {"/mesas"})
    public String listaMesas(Model model){
        model.addAttribute("listaMesas",mesasRepository.findAll());
        return "mesas";
    }
}
