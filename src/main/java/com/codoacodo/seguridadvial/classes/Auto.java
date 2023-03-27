package com.codoacodo.seguridadvial.classes;

public class Auto extends Vehiculo{

    private Long idAuto;
    private Boolean tieneRuedaAux;
    private Boolean autoSeguro;

    public Auto(Boolean tieneRuedaAux, Integer velocidadPropia) {
        super(velocidadPropia);
        this.tieneRuedaAux = tieneRuedaAux;
        this.autoSeguro = false;
    }

    //Método para saber si un Auto es seguro:
    //TODO: Validar si el auto tiene rueda de auxilio y no supera los 140Km/h (velocidad final)
    public Boolean esSeguro(){
        return autoSeguro;
    }
}
