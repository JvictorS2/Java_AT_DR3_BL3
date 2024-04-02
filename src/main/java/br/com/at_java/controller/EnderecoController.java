package br.com.at_java.controller;

import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.service.EnderecoService;
import br.com.at_java.models.service.FuncionarioService;
import spark.Route;

public class EnderecoController {

    // GET: recuperar lista de funcionarios
    public static Route obterList = (req, res) -> {
        return EnderecoService.obterLista();

    };

    // GET: recuperar lista de funcionarios
    public static Route obterPorId = (req, res) -> {
        // recuperar valor do id informado
        Integer index = Integer.valueOf(req.params(("id")));

        // recuperar funcionario
        Funcionario funcionario = FuncionarioService.obterPorId(index);

        return "Funcionário recuperado: " + funcionario;

    };

    //POST: incluir funcionario
    public static Route incluir = (req,res) -> {
        Funcionario funcionario = new Funcionario();

        FuncionarioService.incluir(funcionario);

        return "Inclusão realizada com sucesso: " + funcionario;

    };

    // DELETE: Deletar funcionario
    public static Route excluir = (req,res) -> {
        // recuperar valor do id informado
        Integer index = Integer.valueOf(req.params(("id")));

        // recuperar funcionario
        Funcionario funcionario = FuncionarioService.obterPorId(index);

        // excluir
        FuncionarioService.excluir(index);

        return "Exlusão realizada com sucesso: " + funcionario;

    };

}
