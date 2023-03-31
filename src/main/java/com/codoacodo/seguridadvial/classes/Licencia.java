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