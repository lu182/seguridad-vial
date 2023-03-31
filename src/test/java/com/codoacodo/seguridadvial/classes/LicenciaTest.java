package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class LicenciaTest {

    private TipoLicencia tipoLicencia;
    private Licencia licencia;

    @Before
    public void setUp(){

        tipoLicencia = new TipoLicencia();
        licencia = new Licencia();
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear una Licencia")
    public void testBuildDefaultLicencia(){
        Assert.assertNotNull(licencia);
    }

    @Test
    @DisplayName("Probamos que se pueda crear una Licencia pasandole parametros")
    public void testBuildLicencia(){
        tipoLicencia.setIdTipoLicencia(1L);
        tipoLicencia.setClase("B");
        tipoLicencia.setSubclase("2");
        tipoLicencia.setVigenciaMax(5);

        licencia.setIdLicencia(1L);
        licencia.setFechaOtorgamiento("15/12/2020");
        licencia.setFechaVencimiento("15/12/2025");
        licencia.setTipoLicencia(tipoLicencia);

        System.out.println(licencia.toString());
    }

}