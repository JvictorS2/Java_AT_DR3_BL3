package br.com.at_java.models.domain;

public class Aeroporto {
    private Integer id;
    private String nome;
    private String telefone;
    private String codigoIATA;
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Aeroporto() {
        this.nome = "Aeroporto de Guarulhos";
        this.endereco = new Endereco();
        this.codigoIATA = "GRU";
        this.telefone = "(11) 2445-2945";
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ",\" nome\": " + "\"" + nome + "\"" +
                ", \"telefone\": " + "\"" + telefone + "\"" +
                ", \"codigo\": " + "\"" + codigoIATA + "\"" +
                ", \"endereco\": " + endereco +
                "}";
    }
}
