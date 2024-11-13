package org.example;

import java.time.LocalDateTime;

public class Utilizador {

    private int id;
    private String nome;
    // Construtor que inicializa todas as variáveis
    public Utilizador(int id, String curso, String avaliacoes, LocalDateTime dataLimite, String nome) {
        this.id = id;
        this.nome = nome;
    }

        //Acho que estas variaves deviam ficar em outras classes (curso, avaliações , data limite) e talvez criar uma variavel nome
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //MÉtodos a fazer
    // selecionarCurso(curso: Curso){
    //preencherAvaliacoes(uc: UC, avaliacao: Avaliacao){

}