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
}
