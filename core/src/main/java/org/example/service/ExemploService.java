package org.example.service;

import org.example.domain.Exemplo;
import org.example.ports.PortIn;
import org.springframework.stereotype.Service;

@Service
public class ExemploService implements PortIn {
    @Override
    public String executar(Exemplo exemplo) {
        System.out.println("Executou o Service no Core");
        return exemplo.getNome();
    }
}
