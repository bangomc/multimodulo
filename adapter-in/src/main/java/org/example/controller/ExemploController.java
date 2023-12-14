package org.example.controller;

import org.example.converter.DtoConverter;
import org.example.dto.ExemploDto;
import org.example.ports.PortIn;
import org.example.sequence.SequenceContext;
import org.example.sequence.SequenceExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @Autowired
    private SequenceExecutor<String> sequenceExecutor;

    @GetMapping
    public String hello(){
        return "Olá mundo";
    }

    @PostMapping
    public String hello(@RequestBody ExemploDto exemploDto) {
        System.out.println("Executou o POST");
        return sequenceExecutor.execute(new SequenceContext(exemploDto));
    }
}
