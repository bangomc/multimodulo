package org.example.sequence;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SequenceContextTest extends TestCase {

    public void test() {
        SequenceContext sequenceContext = new SequenceContext<>(9);
        Assert.assertEquals(9, sequenceContext.getPrincipal());
    }

}