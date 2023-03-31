package com.codoacodo.seguridadvial.classes;

public class Auto extends Vehiculo{

    private Long idAuto;
    private Boolean tieneRuedaAux;


    public Auto(Long idAuto, Boolean tieneRuedaAux, Long idVehiculo, String marca, String patente, String modelo,
                String color, Integer anio,Integer velocidadPropia, Integer velocidadFinal){
        super(idVehiculo, marca, patente, modelo, color, anio, velocidadPropia, velocidadFinal);
        this.idAuto = idAuto;
        this.tieneRuedaAux = tieneRuedaAux;
    }

    public Auto(){}

    //GETTERS & SETTERS:
    public Long getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Long idAuto) {
        this.idAuto = idAuto;
    }

    public Boolean getTieneRuedaAux() {
        return tieneRuedaAux;
    }

    public void setTieneRuedaAux(Boolean tieneRuedaAux) {
        this.tieneRuedaAux = tieneRuedaAux;
    }

    //Método para saber si un Auto es seguro dependiedo si tiene ruedaAux y no supera los 140Km/h (velocidad final):
    public Boolean autoSeguro(){
        //TODO: Manejar excepcion NullPointerException
        if(tieneRuedaAux != null && vehiculoSeguro()) {
            return true;
        }else{
            return false;
        }
    }
}