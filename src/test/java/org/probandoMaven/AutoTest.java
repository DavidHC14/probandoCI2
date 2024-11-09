package org.probandoMaven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutoTest {

    @Test
    public void test01DeberiaArrancar() {
        Auto auto = new Auto();
        assertTrue(auto.arrancar());
    }

    @Test
    public void test02DeberiaDetenerse() {
        Auto auto = new Auto();
        assertTrue(auto.detenerse());
    }

}
