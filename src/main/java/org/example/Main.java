package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("João", "joao@email.com", "senha123");
        Semestre semestre = new Semestre();
        EpocaExames epocasDeExames = new EpocaExames();

        int opcao;
        do {
            System.out.println("\nMenu Administrador:");
            System.out.println("1. Definir datas do 1º semestre");
            System.out.println("2. Definir datas do 2º semestre");
            System.out.println("3. Adicionar época de exames");
            System.out.println("4. Ver épocas de exames");
            System.out.println("5. Ver semestres definidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Data de início do 1º semestre (DD-MM-AAAA): ");
                    String inicio = scanner.nextLine();
                    System.out.print("Data de fim do 1º semestre (DD-MM-AAAA): ");
                    String fim = scanner.nextLine();
                    semestre.definirSemestre1(inicio, fim);
                    System.out.println("1º Semestre definido!");
                }
                case 2 -> {
                    System.out.print("Data de início do 2º semestre (DD-MM-AAAA): ");
                    String inicio = scanner.nextLine();
                    System.out.print("Data de fim do 2º semestre (DD-MM-AAAA): ");
                    String fim = scanner.nextLine();
                    semestre.definirSemestre2(inicio, fim);
                    System.out.println("2º Semestre definido!");
                }
                case 3 -> {
                    System.out.println("Escolha o tipo de época:");
                    for (int i = 0; i < EpocaExames.TIPOS_DE_EPOCAS.length; i++) {
                        System.out.println((i + 1) + ". " + EpocaExames.TIPOS_DE_EPOCAS[i]);
                    }
                    int tipo = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpar o buffer

                    System.out.print("Data de início da época (DD-MM-AAAA): ");
                    String inicio = scanner.nextLine();
                    System.out.print("Data de fim da época (DD-MM-AAAA): ");
                    String fim = scanner.nextLine();

                    Integer semestreEscolhido = null;
                    if (tipo != 2) { // "Época Especial" não está vinculada a semestre
                        System.out.print("Semestre (1 ou 2): ");
                        semestreEscolhido = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer
                    }

                    epocasDeExames.adicionarEpoca(tipo, inicio, fim, semestreEscolhido);
                    System.out.println("Época de exames adicionada!");
                }
                case 4 -> {
                    System.out.println("Épocas de exames:");
                    for (EpocaExames.Epoca epoca : epocasDeExames.getEpocas()) {
                        System.out.println(epoca);
                    }
                }
                case 5 -> {
                    System.out.println("Semestres definidos:");
                    System.out.println("1º Semestre: " +
                            (semestre.getInicioSemestre1() == null ? "Não definido" : semestre.getInicioSemestre1() + " a " + semestre.getFimSemestre1()));
                    System.out.println("2º Semestre: " +
                            (semestre.getInicioSemestre2() == null ? "Não definido" : semestre.getInicioSemestre2() + " a " + semestre.getFimSemestre2()));
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

