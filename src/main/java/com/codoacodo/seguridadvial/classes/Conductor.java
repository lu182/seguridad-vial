package com.codoacodo.seguridadvial.classes;

public class Conductor {

    private Long idConductor;
    private String nombre;
    private String apellido;
    private Integer dni;
    private Boolean varEsSeguro;
    private Auto auto;
    private Moto moto;
    private Licencia licencia;


    public Conductor() {
    }

    public Conductor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //this.licencia = false;???
        this.varEsSeguro = false;
    }

    public String getNombre(){
        //return "Luciana";
        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    //Método para saber si un Conductor es seguro:
    //TODO: Validar si el Conductor tiene Licencia y si su Vehículo es seguro p/que sea conductor seguro
    public Boolean esSeguro(){
        //return true; //fuerzo a que me de true para el test
        return varEsSeguro; //el verdadero true o false va a estar dentro de esta variable
    }

    //Método para saber si un conductor tiene licencia??????????:
    public Boolean tieneLicencia(){
        return false;
    }
}
