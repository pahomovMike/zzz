package org.example.zzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XTest {

    @Test
    void sumTest() {

        X x = new X();
        Assertions.assertEquals(4, x.sum(2, 2));
    }

    @Test
    void sumMinus() {
        assertEquals(0, new X().sum(2, -2));
    }
}
