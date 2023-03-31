package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class VehiculoTest {

    private Vehiculo vehiculo;

    @Before
    public void setUp(){

        vehiculo = new Vehiculo();
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear un Vehiculo")
    public void testBuildLicencia(){

        Assert.assertNotNull(vehiculo);
    }
}
