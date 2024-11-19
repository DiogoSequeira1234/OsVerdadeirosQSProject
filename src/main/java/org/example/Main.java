package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Semestre semestre = new Semestre();
        EpocaExames epocasDeExames = new EpocaExames();

        // Criar lista de cursos disponíveis
        List<Cursos> cursosDisponiveis = new ArrayList<>();
        Cursos curso1 = new Cursos("Engenharia Informática", 120);
        Cursos curso2 = new Cursos("Gestão", 80);
        cursosDisponiveis.add(curso1);
        cursosDisponiveis.add(curso2);

        // Criar lista de salas disponíveis
        List<Sala> salas = new ArrayList<>();
        salas.add(new Sala("Sala 101", 50));
        salas.add(new Sala("Sala 102", 30));
        salas.add(new Sala("Sala 103", 40));

        // Criar tipos de UCs disponíveis
        String[] tiposDeUCs = {"Matemática", "Programação", "Física", "Química", "Espanhol"};

        int opcao;
        do {
            System.out.println("\nMenu Administrador:");
            System.out.println("1. Definir datas do 1º semestre");
            System.out.println("2. Definir datas do 2º semestre");
            System.out.println("3. Adicionar época de exames");
            System.out.println("4. Ver épocas de exames");
            System.out.println("5. Ver semestres definidos");
            System.out.println("6. Adicionar UC ao curso");
            System.out.println("7. Calcular espaço necessário para curso");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Data de início do 1º semestre (YYYY-MM-DD): ");
                        String inicio = scanner.nextLine();
                        System.out.print("Data de fim do 1º semestre (YYYY-MM-DD): ");
                        String fim = scanner.nextLine();
                        semestre.definirSemestre1(inicio, fim);
                        System.out.println("1º Semestre definido!");
                    }
                    case 2 -> {
                        System.out.print("Data de início do 2º semestre (YYYY-MM-DD): ");
                        String inicio = scanner.nextLine();
                        System.out.print("Data de fim do 2º semestre (YYYY-MM-DD): ");
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

                        if (tipo >= 0 && tipo < EpocaExames.TIPOS_DE_EPOCAS.length) {
                            System.out.print("Data de início da época (YYYY-MM-DD): ");
                            String inicio = scanner.nextLine();
                            System.out.print("Data de fim da época (YYYY-MM-DD): ");
                            String fim = scanner.nextLine();

                            Integer semestreEscolhido = null;
                            if (tipo != 2) { // "Época Especial" não está vinculada a semestre
                                System.out.print("Semestre (1 ou 2): ");
                                semestreEscolhido = scanner.nextInt();
                                scanner.nextLine(); // Limpar o buffer
                            }

                            epocasDeExames.adicionarEpoca(tipo, inicio, fim, semestreEscolhido);
                            System.out.println("Época de exames adicionada!");
                        } else {
                            System.out.println("Opção inválida para tipo de época!");
                        }
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
                    case 6 -> {
                        // Exibe os cursos disponíveis
                        System.out.println("Escolha um curso para associar UCs:");
                        for (int i = 0; i < cursosDisponiveis.size(); i++) {
                            System.out.println((i + 1) + ". " + cursosDisponiveis.get(i).getNome());
                        }
                        int cursoEscolhidoIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpar o buffer

                        if (cursoEscolhidoIndex >= 0 && cursoEscolhidoIndex < cursosDisponiveis.size()) {
                            Cursos cursoEscolhido = cursosDisponiveis.get(cursoEscolhidoIndex);

                            // Criar lista de UCs a serem associadas
                            List<UC> ucsParaAssociar = new ArrayList<>();
                            System.out.print("Quantas UCs deseja associar? ");
                            int numUCs = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer

                            for (int i = 0; i < numUCs; i++) {
                                // Exibe os tipos de UCs disponíveis
                                System.out.println("Escolha o tipo de UC " + (i + 1) + ":");
                                for (int j = 0; j < tiposDeUCs.length; j++) {
                                    System.out.println((j + 1) + ". " + tiposDeUCs[j]);
                                }

                                // Usuário escolhe uma UC
                                int tipoUC = scanner.nextInt() - 1;
                                scanner.nextLine(); // Limpar o buffer

                                if (tipoUC >= 0 && tipoUC < tiposDeUCs.length) {
                                    ucsParaAssociar.add(new UC(tiposDeUCs[tipoUC])); // Adiciona a UC escolhida
                                } else {
                                    System.out.println("Opção inválida! UC não associada.");
                                }
                            }

                            // Tenta associar as UCs ao curso
                            cursoEscolhido.associarUCs(ucsParaAssociar);
                            System.out.println("UCs associadas com sucesso!");
                        } else {
                            System.out.println("Curso inválido!");
                        }
                    }
                    case 7 -> {
                        // Exibe os cursos disponíveis
                        System.out.println("Escolha um curso para calcular o espaço necessário:");
                        for (int i = 0; i < cursosDisponiveis.size(); i++) {
                            System.out.println((i + 1) + ". " + cursosDisponiveis.get(i).getNome());
                        }
                        int cursoIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Limpar o buffer

                        if (cursoIndex >= 0 && cursoIndex < cursosDisponiveis.size()) {
                            Cursos curso = cursosDisponiveis.get(cursoIndex);
                            List<Sala> salasAlocadas = curso.calcularEspacoNecessario(salas);
                            System.out.println("\nSalas alocadas para o curso " + curso.getNome() + ":");
                            for (Sala sala : salasAlocadas) {
                                System.out.println(sala.getNome() + " (Capacidade: " + sala.getCapacidade() + ")");
                            }
                        } else {
                            System.out.println("Curso inválido!");
                        }
                    }
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                e.printStackTrace(); // Imprime o stack trace para maior detalhamento
            }

        } while (opcao != 0);

        scanner.close();
    }
}
