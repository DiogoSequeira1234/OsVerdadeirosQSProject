package org.example;

import java.util.ArrayList;
import java.util.List;

public class EpocaExames {
    // Lista de épocas criadas
    private List<Epoca> epocas;

    // Tipos de épocas predefinidos
    public static final String[] TIPOS_DE_EPOCAS = {"Normal", "Recurso", "Especial"};

    // Construtor
    public EpocaExames() {
        this.epocas = new ArrayList<>();
    }

    // Metodo para adicionar uma época (escolhida pelo tipo e semestre)
    public void adicionarEpoca(int tipo, String dataInicio, String dataFim, Integer semestre) {
        if (tipo < 0 || tipo >= TIPOS_DE_EPOCAS.length) {
            throw new IllegalArgumentException("Tipo de época inválido.");
        }
        String nome = TIPOS_DE_EPOCAS[tipo];
        epocas.add(new Epoca(nome, dataInicio, dataFim, semestre));
    }

    // Getter para as épocas criadas
    public List<Epoca> getEpocas() {
        return epocas;
    }

    // Classe interna para representar uma época
    public static class Epoca {
        private String nome;
        private String dataInicio;
        private String dataFim;
        private Integer semestre; // Pode ser nulo se não estiver vinculado a um semestre

        public Epoca(String nome, String dataInicio, String dataFim, Integer semestre) {
            this.nome = nome;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
            this.semestre = semestre;
        }

        public String getNome() {
            return nome;
        }

        public String getDataInicio() {
            return dataInicio;
        }

        public String getDataFim() {
            return dataFim;
        }

        public Integer getSemestre() {
            return semestre;
        }

        @Override
        public String toString() {
            return nome + " (" + (semestre == null ? "Fora de Semestre" : "Semestre " + semestre) + "): " + dataInicio + " a " + dataFim;
        }
    }
}
