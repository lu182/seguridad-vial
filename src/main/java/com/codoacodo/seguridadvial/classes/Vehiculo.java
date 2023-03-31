package com.codoacodo.seguridadvial.classes;

public class Vehiculo {
    private Long idVehiculo;
    private String marca;
    private String patente;
    private String modelo;
    private String color;
    private Integer anio;
    private Integer velocidadPropia;
    private Integer velocidadFinal;


    /*
    public Vehiculo(Integer velocidadPropia, Integer velocidadFinal) {
        this.velocidadPropia = velocidadPropia;
        this.velocidadFinal = velocidadFinal;
    }
    */

    public Vehiculo(Long idVehiculo, String marca, String patente, String modelo, String color, Integer anio,
                    Integer velocidadPropia, Integer velocidadFinal) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.velocidadPropia = velocidadPropia;
        this.velocidadFinal = velocidadFinal;
    }

    public Vehiculo() {

    }

    public Boolean vehiculoSeguro(){
        if(this.velocidadFinal <= 140 || this.velocidadFinal <= 160 ){
            return true;
        }else{
            return false;
        }
    }
}