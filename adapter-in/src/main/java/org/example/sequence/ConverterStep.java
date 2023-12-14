package org.example.sequence;

import org.example.converter.DtoConverter;
import org.example.domain.Exemplo;
import org.example.dto.ExemploDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterStep implements Step<Object,Exemplo> {

    @Autowired
    private DtoConverter dtoConverter;

    @Override
    public Exemplo process(SequenceContext context, Object input) {
        ExemploDto principal = (ExemploDto) context.getPrincipal();
        return dtoConverter.fromExemploDto(principal);
    }
}
