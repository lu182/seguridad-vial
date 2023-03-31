package com.codoacodo.seguridadvial.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Licencia {

    private Long idLicencia;
    private Date fechaOtorgamiento;
    private Date fechaVencimiento;
    private TipoLicencia tipoLicencia;//1 Licencia tiene un Tipo de Licencia


    public Licencia() {}

    public Licencia(Long idLicencia, String fechaOtorgamiento, String fechaVencimiento, TipoLicencia tipoLicencia) {
        this.idLicencia = idLicencia;
        this.fechaOtorgamiento = formatearFecha(fechaOtorgamiento);
        this.fechaVencimiento = formatearFecha(fechaVencimiento);
        this.tipoLicencia = tipoLicencia;
    }

    //GETTERS & SETTERS:
    public Long getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Long idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Date getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(String fechaOtorgamiento) {
        this.fechaOtorgamiento = formatearFecha(fechaOtorgamiento);
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = formatearFecha(fechaVencimiento);
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
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

    @Override
    public String toString() {
        return "Licencia{" +
                "idLicencia=" + idLicencia +
                ", fechaOtorgamiento=" + fechaOtorgamiento +
                ", fechaVencimiento=" + fechaVencimiento +
                ", tipoLicencia=" + tipoLicencia +
                '}';
    }
}