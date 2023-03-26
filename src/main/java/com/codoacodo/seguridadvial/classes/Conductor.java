package com.codoacodo.seguridadvial.classes;

public class Conductor {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Boolean varEsSeguro;
    //private Licencia licencia;


    public Conductor() {
    }

    public Conductor(String nombre, String apellido, Boolean esSeguro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.varEsSeguro = esSeguro;
    }

    public String getNombre(){
        //return "Luciana";
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Método para saber si un Conductor es seguro:
    //TODO: Validar cuándo un conductor es seguro y cuándo no
    public Boolean esSeguro(){
        //return true; //fuerzo a que me de true para el test
        return varEsSeguro; //el verdadero true o false va a estar dentro de esta variable
    }
}
