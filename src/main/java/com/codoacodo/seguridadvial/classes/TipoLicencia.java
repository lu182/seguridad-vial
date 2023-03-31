package com.codoacodo.seguridadvial.classes;

public class TipoLicencia {

    private Long idTipoLicencia;
    private String clase;
    private String subclase;
    private Integer vigenciaMax;

    public TipoLicencia() {
    }

    public TipoLicencia(Long idTipoLicencia, String clase, String subclase, Integer vigenciaMax) {
        this.idTipoLicencia = idTipoLicencia;
        this.clase = clase;
        this.subclase = subclase;
        this.vigenciaMax = vigenciaMax;
    }

    //GETTERS & SETTERS:
    public Long getIdTipoLicencia() {
        return idTipoLicencia;
    }

    public void setIdTipoLicencia(Long idTipoLicencia) {
        this.idTipoLicencia = idTipoLicencia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSubclase() {
        return subclase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    public Integer getVigenciaMax() {
        return vigenciaMax;
    }

    public void setVigenciaMax(Integer vigenciaMax) {
        this.vigenciaMax = vigenciaMax;
    }

    @Override
    public String toString() {
        return "TipoLicencia{" +
                "idTipoLicencia=" + idTipoLicencia +
                ", clase='" + clase + '\'' +
                ", subclase='" + subclase + '\'' +
                ", vigenciaMax=" + vigenciaMax +
                '}';
    }
}
