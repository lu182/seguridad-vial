package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class LicenciaTest {

    private Licencia licencia;

    @Before
    public void setUp(){

        licencia = new Licencia();
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear una Licencia")
    public void testBuildLicencia(){
        Assert.assertNotNull(licencia);
    }
}
