package org.example;

import java.time.LocalDate;

public class Semestre {
    private LocalDate dataInicio;
    private LocalDate dataTerminio;
    private int semestre;

    public Semestre() {
        this.dataInicio = dataInicial;
        this.dataTerminio = dataFinal;
        this.semestre = 0;
    }

    public LocalDate getDataFinal() {
        return dataTerminio;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataTerminio = dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicio;
    }

    public void setDataInicial(LocalDate dataInicial) {
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