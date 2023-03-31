package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AutoTest {

    private Auto auto;

    @Before
    public void setUp(){
        auto = new Auto(1L, true, 1L, "Fiat", "ABD120", "Cronos", "Rojo", 2019, 100, 180);
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos si se puede crear un Auto")
    public void testBuildAuto(){
        Assert.assertNotNull(auto);
    }

    @Test
    @DisplayName("Probamos si un Auto es seguro")
    public void testAutoesSeguro(){
        Assert.assertTrue(auto.autoSeguro());
    }

}
