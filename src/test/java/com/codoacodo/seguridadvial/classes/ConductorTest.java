package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ConductorTest {

    private Conductor conductor;

    @Before
    public void setUp(){
        conductor = new Conductor("Luciana", "Fernandez", true); //debo crear contructor con estos parámetros
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear un Conductor")
    public void testBuildConductor(){
        Assert.assertNotNull(conductor);
    }

    @Test
    @DisplayName("Probamos que se pueda obtener el nombre del Conductor")
    public void testGetNombreDelConductor(){
        //para q no me de actual:null
        //conductor.setNombre("Luciana"); --> esto lo reemplazo agregandolo en los argumentos del constructor en método setUp
        Assert.assertEquals("Luciana", conductor.getNombre());
    }

    @Test
    @DisplayName("Probamos poder setearle un nuevo nombre al Conductor")
    public void testSetNombreAConductor(){
        conductor.setNombre("Delfina");
        Assert.assertEquals("Delfina", conductor.getNombre());
    }

    @Test
    @DisplayName("Probamos si un Conductor es seguro")
    public void testConductorEsSeguro(){
        Boolean conductorSeguro = conductor.esSeguro();
        Assert.assertTrue(conductorSeguro);
    }
}
