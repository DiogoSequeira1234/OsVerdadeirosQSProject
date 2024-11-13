package org.example;

public class EpocaExames        {
    private String tipo;
    private String dataInicio;
    private String dataTerminio;

    public EpocaExames(String tipo, String dataInicio, String dataTerminio) {
        this.tipo = tipo;
        this.dataInicio = dataInicio;
        this.dataTerminio = dataTerminio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTerminio() {
        return dataTerminio;
    }

    public void setDataTerminio(String dataTerminio) {
        this.dataTerminio = dataTerminio;
    }

    //Métodos a fazer
    //incluirAvaliacao(avaliacao: Avaliacao)
}