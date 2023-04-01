package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.internal.matchers.Null;

public class AutoTest {

    private TipoLicencia tipoLicenciaAuto;
    private Licencia licenciaAuto;
    private Auto auto;
    private Conductor conductorConAuto;

    @Before
    public void setUp(){
        tipoLicenciaAuto = new TipoLicencia(2L, "B", "1",5);
        licenciaAuto = new Licencia(1L, "10/09/2020", "10/09/2025", tipoLicenciaAuto);
        auto = new Auto(1L, true, 1L, "Fiat", "ABD120", "Cronos", "Rojo", 2020, 100, 140);
        conductorConAuto = new Conductor(1L, "Luciana", "Fernandez", "10/09/1990",34698777, licenciaAuto, auto);

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
