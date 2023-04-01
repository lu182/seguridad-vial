package com.codoacodo.seguridadvial.classes;

public class Moto extends Vehiculo{

    private Long idMoto;
    private Integer cantEspejos;
    private String cilindrada;
    private String potenciaMax;


    public Moto(Long idMoto, Integer cantEspejos, String cilindrada, String potenciaMax, Long idVehiculo, String marca,
                String patente, String modelo, String color, Integer anio,Integer velocidadPropia,
                Integer velocidadFinal){
        super(idVehiculo, marca, patente, modelo, color, anio, velocidadPropia, velocidadFinal);
        this.idMoto = idMoto;
        this.cantEspejos = cantEspejos;
        this.cilindrada = cilindrada;
        this.potenciaMax = potenciaMax;
    }

    public Moto(){}

    //GETTERS & SETTERS:
    public Long getIdMoto() {
        return idMoto;
    }

    public void setIdMoto(Long idMoto) {
        this.idMoto = idMoto;
    }

    public Integer getCantEspejos() {
        return cantEspejos;
    }

    public void setCantEspejos(Integer cantEspejos) {
        this.cantEspejos = cantEspejos;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(String potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    //Método p/saber si una Moto es segura dependiendo si tiene 2 espejos como min. y no supera los 160Km/h (velocidad final):
    public Boolean motoSegura(){
        try {
            if(cantEspejos == null){
                throw new NullPointerException("La propiedad cantEspejos es null");
            }else if(cantEspejos >= 2 && vehiculoMotoSeguro()){
                System.out.println("La moto es segura");
                return true;
            }else{
                throw new Exception("La moto no tiene 2 espejos como mínimo o no es un vehículo seguro");
            }
        }catch(NullPointerException e){
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Se produjo una excepción --> Clase: " + e.getClass().getCanonicalName() + ", Mensaje: " + e.getMessage());
            return false;
        }
    }

}