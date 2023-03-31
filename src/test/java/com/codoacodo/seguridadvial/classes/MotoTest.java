package com.codoacodo.seguridadvial.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MotoTest {

    private Moto moto;

    @Before
    public void setUp(){
        moto = new Moto(1L,2,1L,"Honda", "AGH123", "Wave", "Azul", 2018, 120, 140);
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
