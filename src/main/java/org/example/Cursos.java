package org.example;

public class Cursos {
    private String nome;
    private int numeroAlunos;

    public Cursos(String nome, int numeroAlunos) {
        this.nome = nome;
        this.numeroAlunos = numeroAlunos;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos a fazer
    //associarUCs(ucs: List<UC>)
    //calcularEspacoNecessario()
}
