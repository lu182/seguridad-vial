package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ConductorTest {

    private TipoLicencia tipoLicenciaAuto;
    private Licencia licenciaAuto;
    private Auto auto;
    private Conductor conductorConAuto;

    private TipoLicencia tipoLicenciaMoto;
    private Licencia licenciaMoto;
    private Moto moto;
    private Conductor conductorConMoto;


    @Before
    public void setUp(){

        tipoLicenciaAuto = new TipoLicencia(2L, "B", "1",5);
        licenciaAuto = new Licencia(1L, "10/09/2020", "10/09/2025", tipoLicenciaAuto);
        auto = new Auto(1L, true, 1L, "Fiat", "ABD120", "Cronos", "Rojo", 2020, 100, 140);
        conductorConAuto = new Conductor(1L, "Luciana", "Fernandez", "10/09/1990",34698777, licenciaAuto, auto);

        tipoLicenciaMoto = new TipoLicencia(1L, "A", "1.2",5);
        licenciaMoto = new Licencia(3L,"11/02/2020", "11/02/2025", tipoLicenciaMoto);
        moto = new Moto(1L,2, "150cc","11kw", 1L,"Honda", "AGH123", "Wave", "Azul", 2018, 120, 140);
        conductorConMoto = new Conductor(2L,"Mark", "Hoppus", "15/03/1972", 24544852, licenciaMoto, moto);
    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos que se pueda crear un Conductor")
    public void testBuildConductor(){
        Assert.assertNotNull(conductorConAuto);
    }

    @Test
    @DisplayName("Probamos que se pueda obtener el nombre del Conductor del auto")
    public void testGetNombreDelConductor(){
        //para q no me de actual:null
        //conductor.setNombre("Luciana"); --> esto lo reemplazo agregandolo en los argumentos del constructor en método setUp
        Assert.assertEquals("Luciana", conductorConAuto.getNombre());
    }

    @Test
    @DisplayName("Probamos poder setearle un nuevo nombre al Conductor del auto")
    public void testSetNombreAConductor(){
        conductorConAuto.setNombre("Delfina");
        Assert.assertEquals("Delfina", conductorConAuto.getNombre());
    }

    @Test
    @DisplayName("Probamos si un Conductor de auto, es seguro")
    public void testConductorAutoEsSeguro(){
        Boolean conductorSeguro = conductorConAuto.esConductorAutoSeguro();
        Assert.assertTrue(conductorSeguro);
    }

    @Test
    @DisplayName("Probamos si un Conductor de moto, es seguro")
    public void testConductorMotoEsSeguro(){
        Boolean conductorSeguro = conductorConMoto.esConductorMotoSeguro();
        Assert.assertTrue(conductorSeguro);
    }

    @Test
    @DisplayName("Probamos si un Conductor de auto tiene Licencia")
    public void testConductorAutoTieneLicencia(){
        Assert.assertNotNull(conductorConAuto.getLicencia());
    }

    @Test
    @DisplayName("Probamos si un Conductor de moto tiene Licencia")
    public void testConductorMotoTieneLicencia(){
        Assert.assertNotNull(conductorConMoto.getLicencia());
    }

}