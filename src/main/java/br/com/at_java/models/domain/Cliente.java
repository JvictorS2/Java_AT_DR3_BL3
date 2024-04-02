package br.com.at_java.models.domain;

import br.com.at_java.models.domain.Pessoa;

public class Cliente extends Pessoa {
    private Integer id;
    // Pseudo cadastro
    private String Email;
    private String telefone;

    // se nulo o cliente não possui passagem
    private Passagem passagem;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public Cliente(String nome, Integer idade, String cpf, Endereco endereco, String email, String telefone) {
        super(nome, idade, cpf, endereco);
        Email = email;
        this.telefone = telefone;
        this.passagem = null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", passagem=" + passagem +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
