package org.example.controller;

import org.example.converter.DtoConverter;
import org.example.dto.ExemploDto;
import org.example.ports.PortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @Autowired
    private PortIn portIn;

    @Autowired
    private DtoConverter dtoConverter;

    @GetMapping
    public String hello(){
        return "Olá mundo";
    }
    @PostMapping
    public String hello(@RequestBody ExemploDto exemploDto) {
        System.out.println("Executou o POST");
        return portIn.executar(dtoConverter.fromExemploDto(exemploDto));
    }
}
