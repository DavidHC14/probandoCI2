package org.probandoMaven;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class AutoTest {

    @Test
    public void prueba1() {
        Auto auto = new Auto();
        assertTrue(auto.arrancar());
    }

}
