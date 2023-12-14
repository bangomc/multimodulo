package org.example.sequence;

import org.example.domain.Exemplo;
import org.example.ports.PortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegraNegocioIniciarStep implements Step<Exemplo,String> {

    @Autowired
    private PortIn portIn;

    @Override
    public String process(SequenceContext context, Exemplo input) {
        return portIn.executar(input);
    }
}
