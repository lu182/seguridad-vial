package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TipoLicenciaTest {

    private TipoLicencia tipoLicencia;

    @Before
    public void setUp(){

        tipoLicencia = new TipoLicencia();
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear un TipoLicencia")
    public void testBuildLicencia(){

        Assert.assertNotNull(tipoLicencia);
    }
}
