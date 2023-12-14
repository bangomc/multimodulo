package org.example.sequence;

import java.util.HashMap;

public class SequenceContext<T> extends HashMap<String, Object> {

    private static String PRINCIPAL = "principal";

    public SequenceContext(T principal) {
        super();
        this.addPrincipal(principal);
    }

    public <T> T getPrincipal() {
        return (T) get(PRINCIPAL);
    }

    private void addPrincipal(T principal) {
        put(PRINCIPAL,principal);
    }
}
