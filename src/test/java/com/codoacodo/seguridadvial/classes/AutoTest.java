package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AutoTest {

    private Auto auto;

    @Before
    public void setUp(){
        auto = new Auto(true, 100);
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
        Assert.assertTrue(auto.esSeguro());
    }

}
