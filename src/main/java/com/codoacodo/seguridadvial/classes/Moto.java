package com.codoacodo.seguridadvial.classes;

public class Moto extends Vehiculo{

    private Long idMoto;
    private Integer cantEspejos;


    public Moto(Long idMoto, Integer cantEspejos, Long idVehiculo, String marca, String patente, String modelo,
                String color, Integer anio,Integer velocidadPropia, Integer velocidadFinal){
        super(idVehiculo, marca, patente, modelo, color, anio, velocidadPropia, velocidadFinal);
        this.idMoto = idMoto;
        this.cantEspejos = cantEspejos;
    }

    //Método p/saber si una Moto es segura dependiendo si tiene 2 espejos como min. y no supera los 160Km/h (velocidad final):
    public Boolean motoSegura(){
        if(cantEspejos >= 2 && vehiculoSeguro()){
            return true;
        }else{
            return false;
        }

    }
}