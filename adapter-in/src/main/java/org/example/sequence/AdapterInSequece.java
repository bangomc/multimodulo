package org.example.sequence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterInSequece {

    @Bean
    public SequenceExecutor<String> adapterInSequeceExecutor(ConverterStep converterStep, RegraNegocioIniciarStep regraNegocioIniciarStep){
        SequenceExecutor<String> stringSequenceExecutor = new SequenceExecutor<>();
        stringSequenceExecutor.addStep(converterStep);
        stringSequenceExecutor.addStep(regraNegocioIniciarStep);
        return stringSequenceExecutor;
    }
}
