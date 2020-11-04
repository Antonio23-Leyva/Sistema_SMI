package com.example.Sistema_SMI.controlador;

import com.example.Sistema_SMI.InterfazServicio.IsensorServicio;
import com.example.Sistema_SMI.modelo.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IsensorServicio srv;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Sensor> sensores = srv.listar();
        model.addAttribute("sensores",sensores);
        return "index";
    }

}
