package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ConductorTest {

    //private Vehiculo vehiculo;
    private TipoLicencia tipoLicencia;
    private Licencia licencia;
    private Auto auto;
    private Moto moto;
    private Conductor conductorConAuto;
    private Conductor conductorConMoto;


    @Before
    public void setUp(){
        //vehiculo = new Vehiculo();
        tipoLicencia = new TipoLicencia(1L, "B", "2.1",5);
        licencia = new Licencia(1L, "10/09/2017", "10/09/2030", tipoLicencia);
        auto = new Auto(1L, true, 1L, "Fiat", "ABD120", "Cronos", "Rojo", 2019, 100, 180);
        moto = new Moto(1L,2,1L,"Honda", "AGH123", "Wave", "Azul", 2018, 120, 140);
        conductorConAuto = new Conductor(1L, "Luciana", "Fernandez", "10/09/1990",33698777, licencia, auto);
        conductorConMoto = new Conductor(1L,"Mark", "Hoppus", "12/03/1980", 32544852, licencia, moto);
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear un Conductor")
    public void testBuildConductor(){
        Assert.assertNotNull(conductorConAuto);
    }

    @Test
    @DisplayName("Probamos que se pueda obtener el nombre del Conductor")
    public void testGetNombreDelConductor(){
        //para q no me de actual:null
        //conductor.setNombre("Luciana"); --> esto lo reemplazo agregandolo en los argumentos del constructor en método setUp
        Assert.assertEquals("Luciana", conductorConAuto.getNombre());
    }

    @Test
    @DisplayName("Probamos poder setearle un nuevo nombre al Conductor")
    public void testSetNombreAConductor(){
        conductorConAuto.setNombre("Delfina");
        Assert.assertEquals("Delfina", conductorConAuto.getNombre());
    }

    @Test
    @DisplayName("Probamos si un Conductor es seguro")
    public void testConductorEsSeguro(){
        Boolean conductorSeguro = conductorConAuto.esConductorSeguro();
        Assert.assertTrue(conductorSeguro);
    }

    @Test
    @DisplayName("Probamos si un Conductor tiene Licencia")
    public void testConductorTieneLicencia(){

        Assert.assertNotNull(conductorConAuto.getLicencia());
    }

}