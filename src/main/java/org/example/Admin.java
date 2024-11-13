package org.example;

public class Admin {
    private int id;
    private String nome;
    private String epocaExames;// o administrador deve definir epocas de exames

    public  Admin(int id, String nome, String epocaExames) {
        this.id = id;
        this.nome = nome;
        this.epocaExames = epocaExames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    //private void pridefinirSemestre(inicio: Date, fim: Date){
    //private void definirEpocaExames(semestre: Semestre, epocas: List<Epoca>){
}