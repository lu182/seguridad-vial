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
        try {
            if (tieneRuedaAux == null) {
                throw new NullPointerException("La propiedad tieneRuedaAux es null");
            }else if(tieneRuedaAux && vehiculoAutoSeguro()){
                return true;
            }else{
                throw new Exception("El auto no tiene rueda de auxilio o no es un vehículo seguro");
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