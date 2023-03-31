package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MotoTest {

    private TipoLicencia tipoLicenciaMoto;
    private Licencia licenciaMoto;
    private Moto moto;
    private Conductor conductorConMoto;

    @Before
    public void setUp(){
        tipoLicenciaMoto = new TipoLicencia(1L, "A", "1.2",5);
        licenciaMoto = new Licencia(3L,"11/02/2020", "11/02/2025", tipoLicenciaMoto);
        moto = new Moto(1L,2, "150cc","11kw", 1L,"Honda", "AGH123", "Wave", "Azul", 2018, 120, 160);
        conductorConMoto = new Conductor(2L,"Mark", "Hoppus", "15/03/1972", 24544852, licenciaMoto, moto);

    }

    //TEST UNITARIOS:
    @Test
    @DisplayName("Probamos si se puede crear una Moto")
    public void testBuildMoto(){
        Assert.assertNotNull(moto);
    }

    @Test
    @DisplayName("Probamos si una Moto es segura")
    public void testMotoesSegura(){
        Assert.assertTrue(moto.motoSegura());
    }
}
