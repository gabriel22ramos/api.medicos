package com.medicos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Controller {

    @GetMapping
    public String olaMundo (){
        return "olá mundo!";
    }
    // informar para o spring que a classe Controller é um controlador
    // informar o endpoint do controller (mapeamento do endereço)
    //GET --> ola mundo 
}
