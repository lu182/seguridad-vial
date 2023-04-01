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

    //GETTERS & SETTERS:
    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getVelocidadPropia() {
        return velocidadPropia;
    }

    public void setVelocidadPropia(Integer velocidadPropia) {
        this.velocidadPropia = velocidadPropia;
    }

    public Integer getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(Integer velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    //Método para saber si el vehiculo auto es seguro:
    public Boolean vehiculoAutoSeguro(){
        try {
            if(velocidadFinal == null) {
                throw new NullPointerException("La propiedad velocidadFinal es null");
            }else if(velocidadFinal <= 140){
                return true;
            }else{
                throw new Exception("El vehículo auto no es un vehículo seguro");
            }
        }catch(NullPointerException e){
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }

    }
    //Método para saber si es un vehiculo seguro:
    public Boolean vehiculoMotoSeguro(){
        try {
            if(velocidadFinal == null){
                throw new NullPointerException("La propiedad velocidadFinal es null");
            }else if(velocidadFinal <= 160){
                return true;
            }else{
                throw new Exception("El vehículo moto no es un vehículo seguro");
            }
        }catch (NullPointerException e){
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anio=" + anio +
                ", velocidadPropia=" + velocidadPropia +
                ", velocidadFinal=" + velocidadFinal +
                '}';
    }
}