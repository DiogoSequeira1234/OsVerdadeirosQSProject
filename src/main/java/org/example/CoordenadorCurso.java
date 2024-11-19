package org.example;

public class CoordenadorCurso extends Utilizador {

    public CoordenadorCurso(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Metodo para selecionar o curso correspondente
    public void selecionarCurso(String curso) {
        // Implementação para selecionar curso
        System.out.println("Curso selecionado: " + curso);
    }

    // Metodo para preencher avaliações ao longo do semestre
    public void preencherAvaliacoes(String uc, String tipoAvaliacao, String data, double peso) {
        // Implementação para adicionar avaliação
        System.out.println("Avaliação adicionada:");
        System.out.println("UC: " + uc + ", Tipo: " + tipoAvaliacao + ", Data: " + data + ", Peso: " + peso + "%");
    }
}
