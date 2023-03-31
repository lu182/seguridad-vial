package com.codoacodo.seguridadvial.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conductor {

    private Long idConductor;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private Integer dni;
    private Licencia licencia;
    private Auto auto; //1 Conductor puede tener un Auto(y no más que uno)
    private Moto moto; //1 Conductor puede tener una Moto


    public Conductor() {
    }

    //Constructor para un Conductor con Auto:
    public Conductor(Long idConductor, String nombre, String apellido, String fechaNac, Integer dni, Licencia licencia, Auto auto) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = formatearFecha(fechaNac);
        this.dni = dni;
        this.licencia = licencia;
        this.auto = auto;
    }

    //Constructor para un Conductor con Moto:
    public Conductor(Long idConductor, String nombre, String apellido, String fechaNac, Integer dni, Licencia licencia, Moto moto) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = formatearFecha(fechaNac);
        this.dni = dni;
        this.licencia = licencia;
        this.moto = moto;
    }

    //GETTERS & SETTERS:
    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre(){
        //return "Luciana";
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    //MÉTODOS:
    //Método p/saber si es conductor seguro dependiendo si tiene licencia o no y si su vehiculo (auto o moto) es seguro
    public Boolean esConductorSeguro() {
        //Valido si tiene licencia y si su vehiculo (auto o moto) es seguro
        if ((licencia == null && !auto.autoSeguro()) || (licencia == null && !moto.motoSegura())) {
            return false;
        } else {
            return true;
        }
    }

    //Método para formatear fecha:
    public Date formatearFecha(String fechaStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formatter.parse(fechaStr);
            return fecha;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}