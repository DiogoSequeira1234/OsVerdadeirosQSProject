package org.example;

import java.time.LocalDate;

public class Admin {
    private int id;
    private String nome;
    private String epocaExames;// o administrador deve definir epocas de exame
    private Semestre semestre;

    public  Admin() {
        this.id = 1;
        this.nome = "João";
        this.epocaExames = epocaExames;
    }

    public String getNome() {
        return nome;
    }

    public String getEpocaExames() {
        return epocaExames;
    }

    public void setEpocaExames(String epocaExames) {
        this.epocaExames = epocaExames;
    }

    public int getId() {
        return id;
    }

    //MÉTODOS a fazer
    private static void DefinirSemestre(Semestre semestre, LocalDate dataInicio, LocalDate dataFim){
        // Verifica se a data de fim é posterior à data de início
        if (dataFim.isAfter(dataInicio)) {
            semestre.setDataInicial(dataInicio);
            semestre.setDataFinal(dataFim);
            System.out.println("Semestre definido com sucesso.");
        } else {
            System.out.println("Erro: A data de fim deve ser posterior à data de início.");
        }
    }
    //private void definirEpocaExames(semestre: Semestre, epocas: List<Epoca>){
}