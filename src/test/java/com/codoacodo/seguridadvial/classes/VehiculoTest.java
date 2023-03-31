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
    public void testBuildDefaultVehiculo(){

        Assert.assertNotNull(vehiculo);
    }

    @Test
    @DisplayName("Probamos que se pueda crear un Vehiculo pasandole parametros")
    public void testBuildVehiculo(){
        vehiculo.setIdVehiculo(1L);
        vehiculo.setMarca("Chevrolet");
        vehiculo.setPatente("ASD541");
        vehiculo.setModelo("Camaro");
        vehiculo.setColor("Negro");
        vehiculo.setAnio(1973);
        vehiculo.setVelocidadPropia(100);
        vehiculo.setVelocidadFinal(190);

        System.out.println(vehiculo.toString());

    }
}
