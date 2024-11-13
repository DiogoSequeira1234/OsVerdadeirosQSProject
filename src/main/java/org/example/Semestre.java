package org.example;

public class Semestre {
    private String dataInicio;
    private String dataTerminio;
    private int semestre;

    public Semestre(String dataInicial, String dataFinal, int semestre) {
        this.dataInicio = dataInicial;
        this.dataTerminio = dataFinal;
        this.semestre = 0;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //MÉTODOS a fazer
    //adicionarEpocas(epocas: List<Epoca>)

}