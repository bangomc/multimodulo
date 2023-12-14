package org.example.sequence;

import java.util.LinkedList;
import java.util.List;

public class SequenceExecutor<T> {

    private List<Step> steps = new LinkedList();

    public void addStep(Step step){
        this.steps.add(step);
    }

    public <T> T execute(SequenceContext context) {

        Object output = null;

        for (Step step: steps) {
            try {
                if(step.canProcesses(context)){
                    System.out.println("Executando step "+step.getClass().getSimpleName());
                    output = step.process(context, output);
                }
            } catch (Exception ex) {
                System.err.println(ex.getCause());
            }
        }

        return (T) output;
    }

}
