package org.probandoMaven;

import org.junit.jupiter.api.Test;

public class AutoTest {

    @Test
    public void prueba1() {
        Auto auto = new Auto();
        assertTrue(auto.arrancar());
    }

}
