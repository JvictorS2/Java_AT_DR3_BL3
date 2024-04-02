package br.com.at_java.models.domain;

public class Passagem {
    // fileds
    private Integer id;
    private String localPartida;
    private String localChegada;
    private Float preco;
    private String horario;

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalChegada() {
        return localChegada;
    }

    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Passagem(String localPartida, String localChegada, Float preco, String horario) {
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.preco = preco;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ",\" localPartida\": " + localPartida +
                ", \"localChegada\": " + localChegada +
                ", \"preco\": " + preco +
                ", \"horario\": " + horario +
               "}";
    }
}
