package org.example.sequence;

public interface Step<I,O> {

    O process(SequenceContext context, I input);

    default boolean canProcesses(SequenceContext context){
        return true;
    }

}
