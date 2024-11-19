package org.example;

public class UC {
    private String nome;

    // Array com os tipos de UC disponíveis
    public static final String[] TIPOS_DE_UC = {"Matemática", "Programação", "Física", "Química", "Espanhol"};

    // Construtor para inicializar a UC com um nome
    public UC(String nome) {
        this.nome = nome;
    }

    // Getter para obter o nome da UC
    public String getNome() {
        return nome;
    }

    // Setter para alterar o nome da UC
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo para retornar uma representação da UC
    @Override
    public String toString() {
        return this.nome;
    }

    // Metodo estático para listar os tipos de UC
    public static void listarTiposDeUC() {
        System.out.println("Tipos de Unidades Curriculares disponíveis:");
        for (int i = 0; i < TIPOS_DE_UC.length; i++) {
            System.out.println((i + 1) + ". " + TIPOS_DE_UC[i]);
        }
    }
}
