package br.com.at_java.models.domain;

public class Endereco {
    private Integer id;
    private String rua;
    private String bairro;
    private String cidade;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco() {
        this.id = 1;
        this.rua = "Rod. Hélio Smidt, s/n";
        this.bairro = "Cumbica";
        this.cidade = "Guarulhos";
    }

    public Endereco(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ",\" rua\": " + "\"" + rua + "\"" +
                ", \"bairro\": " + "\"" + bairro + "\"" +
                ", \"cidade\": " + "\"" + cidade + "\"" +
                "}";
    }
}
