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
    public void testBuildDefaultTipoLicencia(){

        Assert.assertNotNull(tipoLicencia);
    }

    @Test
    @DisplayName("Probamos que se pueda crear un TipoLicencia pasandole parametros")
    public void testBuildTipoLicencia(){
        tipoLicencia.setIdTipoLicencia(1L);
        tipoLicencia.setClase("A");
        tipoLicencia.setSubclase("1.2");
        tipoLicencia.setVigenciaMax(5);

        System.out.println(tipoLicencia.toString());
    }
}
