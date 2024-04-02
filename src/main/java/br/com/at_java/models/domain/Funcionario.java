package br.com.at_java.models.domain;

public class Funcionario extends Pessoa {
    // fileds
    private Integer id;
    private Aeroporto aeroporto;
    private String cargo;
    private Float salario;

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario(Aeroporto aeroporto, String cargo, Float salario) {
        super();
        this.aeroporto = aeroporto;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, int idade, String cpf, Endereco endereco, Aeroporto aeroporto, String cargo, Float salario) {
        super(nome, idade, cpf, endereco);
        this.aeroporto = aeroporto;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(){
        super();
        this.aeroporto = new Aeroporto();
        this.cargo = "Atendente";
        this.salario = 2800f;
    }


    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ",\" nome\": " + "\"" + nome + "\"" +
                ", \"idade\": " + idade +
                ", \"cpf\": " + "\"" + cpf + "\"" +
                ", \"cargo\": " +  "\"" +cargo + "\"" +
                ", \"salario\": " + salario +
                ", \"endereco\": " + endereco +
                ", \"aeroporto\": " + aeroporto +
                "}";
    }
}

