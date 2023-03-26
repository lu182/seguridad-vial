package com.codoacodo.seguridadvial.classes;

public class Vehiculo {
    private String marca;
    private String patente;
    private String modelo;
    private String color;
    private Integer velocidadPropia;
    private Integer velocidadFinal;

    public Vehiculo(Integer velocidadPropia) {
        this.velocidadPropia = velocidadPropia;
    }
}
