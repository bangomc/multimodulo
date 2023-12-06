package org.example.converter;

import org.example.domain.Exemplo;
import org.example.dto.ExemploDto;
import org.springframework.stereotype.Component;

@Component
public class DtoConverter {

    public Exemplo fromExemploDto(ExemploDto exemploDto){
        Exemplo exemplo = new Exemplo();
        exemplo.setNome(exemploDto.getNome());
        return exemplo;
    }

}
