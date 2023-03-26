package com.codoacodo.seguridadvial.classes;

public class Moto extends Vehiculo{

    private Integer cantEspejos;
    private Boolean motoSegura;

    public Moto(Integer cantEspejos, Integer velocidadPropia) {
        super(velocidadPropia);
        this.cantEspejos = cantEspejos;
        this.motoSegura = false;
    }

    //Método para saber si una Moto es segura:
    //TODO: Validar si la moto tiene 2 espejos como minimo y que no supere los 160Km/h (velocidad final)
    public Boolean esSegura(){
        return motoSegura;
    }
}
