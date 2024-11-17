package org.example;

public class Admin extends Utilizador {

    public Admin (String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Metodo para definir o início e fim do semestre
    public void definirSemestre(String inicio, String fim) {
        // Implementação para salvar as datas
        System.out.println("Semestre definido de " + inicio + " até " + fim);
    }

    // Metodo para definir épocas de exames
    public void definirEpocasDeExames(String[] epocas) {
        // Implementação para salvar as épocas
        System.out.println("Épocas de exames definidas:");
        for (String epoca : epocas) {
            System.out.println(" - " + epoca);
        }
    }
}