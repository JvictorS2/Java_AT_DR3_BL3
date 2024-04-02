package br.com.at_java.controller;

import br.com.at_java.models.domain.Aeroporto;
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
        Endereco endereco = EnderecoService.obterPorId(index);

        return "Funcionário recuperado: " + endereco;

    };

    public static Route incluir = (req, res) -> {

        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco endereco = new Endereco(rua,bairro,cidade);


       EnderecoService.incluir(endereco);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + endereco);
        return null;
    };

    // DELETE: Deletar funcionario
    public static Route excluir = (req,res) -> {
        // recuperar valor do id informado
        Integer index = Integer.parseInt(req.queryParams("id"));
        System.out.println(index);
        // recuperar funcionario
        Endereco endereco = EnderecoService.obterPorId(index);

        // excluir
        EnderecoService.excluir(index);

        res.redirect("/");
        //System.out.println("Apagado: " + funcionario);
        return null;

    };

    public static Route atualizar = (req, res) -> {

        Integer id = Integer.parseInt(req.queryParams("id"));
        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco enderecoAntigo = EnderecoService.obterPorId(id);
        Endereco enderecoNovo = new Endereco(rua,bairro,cidade);


        EnderecoService.atualizar(enderecoAntigo,enderecoNovo);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + enderecoAntigo);
        return null;
    };

}
