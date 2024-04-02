package br.com.at_java.models.domain;

public abstract class Pessoa {
    // fields
    protected String nome;
    protected int idade;
    protected String cpf;
    protected Endereco endereco;

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // constructor
    public Pessoa() {
        this.nome = "João Victor";
        this.idade = 20;
        this.cpf = "123456789-10";
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, int idade, String cpf, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // toString
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
