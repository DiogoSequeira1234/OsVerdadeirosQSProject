package org.example;

import java.time.LocalDateTime;

public class Utilizador {
    private int id;
    private String curso; // O utilizador deve ser capaz de selecionar o curso correspondente para a criação do mapa
    private String avaliacoes; // O utilizador deve preencher as avaliações das diferentes UC ao longo do semestre
    private LocalDateTime dataLimite; // o utilizador pode colocar data limite (especifico em dia e hora) na entrega dos trabalhos)

    // Construtor que inicializa todas as variáveis
    public Utilizador(int id, String curso, String avaliacoes, LocalDateTime dataLimite) {
        this.id = id;
        this.curso = curso;
        this.avaliacoes = avaliacoes;
        this.dataLimite = dataLimite;
    }

        //Acho que estas variaves deviam ficar em outras classes (curso, avaliações , data limite) e talvez criar uma variavel nome
    
    // Getters e Setters
    public int getId() {
        return id;
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(String avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDateTime dataLimite) {
        this.dataLimite = dataLimite;
    }
}