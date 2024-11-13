package org.example;

public class Semestre {
    private String dataInicio;
    private String dataTerminio;

    public Semestre(String dataInicial, String dataFinal) {
        this.dataInicio = dataInicial;
        this.dataTerminio = dataFinal;
    }

    public String getDataFinal() {
        return dataTerminio;
    }

    public void setDataFinal(String dataFinal) {
        this.dataTerminio = dataFinal;
    }

    public String getDataInicial() {
        return dataInicio;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicio = dataInicial;
    }
}