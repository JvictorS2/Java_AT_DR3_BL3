package br.com.at_java.controller;

import br.com.at_java.models.domain.Aeroporto;
import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.service.FuncionarioService;
import spark.Route;

public class FuncionarioController {

    // GET: recuperar lista de funcionarios
    public static Route obterList = (req,res) -> {
        return FuncionarioService.obterLista();

    };

    // GET: recuperar lista de funcionarios
    public static Route obterPorId = (req, res) -> {
        // recuperar valor do id informado
        Integer index = Integer.valueOf(req.params(("id")));

        // recuperar funcionario
        Funcionario funcionario = FuncionarioService.obterPorId(index);

        return funcionario;

    };

    //POST: incluir funcionario
    public static Route incluir = (req, res) -> {
        // campos
        String nome = req.queryParams("nome");
        Integer idade = Integer.parseInt(req.queryParams("idade"));
        String cargo = req.queryParams("cargo");
        Float salario = Float.parseFloat(req.queryParams("salario"));
        String cpf = req.queryParams("cpf");

        // endereco
        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco endereco = new Endereco(rua,bairro,cidade);

        //testes
        //System.out.println(req.queryParams("cargo"));
        //System.out.println(req.queryParams("salario"));

        Funcionario funcionario = new Funcionario(nome,idade,cpf,endereco,new Aeroporto(),cargo,salario);
        FuncionarioService.incluir(funcionario);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + funcionario);
        return null;
    };

    // DELETE: Deletar funcionario
    public static Route excluir = (req,res) -> {
        // recuperar valor do id informado
        Integer index = Integer.parseInt(req.queryParams("id"));
        System.out.println(index);
        // recuperar funcionario
        Funcionario funcionario = FuncionarioService.obterPorId(index);

        // excluir
        FuncionarioService.excluir(index);

        res.redirect("/");
        //System.out.println("Apagado: " + funcionario);
        return null;

    };

    // PUT: Atualizar funcionario

    public static Route atualizar = (req,res) -> {
        // campos
        Integer id = Integer.parseInt(req.queryParams("id"));
        String nome = req.queryParams("nome");
        Integer idade = Integer.parseInt(req.queryParams("idade"));
        String cargo = req.queryParams("cargo");
        Float salario = Float.parseFloat(req.queryParams("salario"));
        String cpf = req.queryParams("cpf");

        // endereco
        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco endereco = new Endereco(rua,bairro,cidade);

        //testes
        //System.out.println(req.queryParams("cargo"));
        //System.out.println(req.queryParams("salario"));
        Funcionario funcionarioAntigo = FuncionarioService.obterPorId(id);
        Funcionario funcionarioNovo = new Funcionario(nome,idade,cpf,endereco,new Aeroporto(),cargo,salario);
        FuncionarioService.atualizar(funcionarioAntigo,funcionarioNovo);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("funcionario atualizado: " + funcionarioNovo);
        return null;
    };



}
