package br.com.at_java.controller;

import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.domain.Passagem;
import br.com.at_java.models.service.EnderecoService;
import br.com.at_java.models.service.FuncionarioService;
import br.com.at_java.models.service.PassagemService;
import spark.Route;

import java.util.ArrayList;
import java.util.List;

public class PassagemController {


    // GET: recuperar lista de passagem
    public static Route obterList = (req, res) -> {
        return PassagemService.obterLista();

    };

    // GET: recuperar lista de passagem

    public static Route obterPorId = (req, res) -> {
        // recuperar valor do id informado
        Integer index = Integer.valueOf(req.params(("id")));

        // recuperar funcionario
        Passagem passagem = PassagemService.obterPorId(index);

        return "Funcionário recuperado: " + passagem;

    };

    public static Route incluir = (req, res) -> {

        String localChegada = req.queryParams("localChegada");
        String localPartida = req.queryParams("localPartida");
        Float Preco = Float.parseFloat( req.queryParams("preco"));
        String duracao = req.queryParams("duracao");

        Passagem passagem = new Passagem(localPartida,localChegada,Preco,duracao);


        PassagemService.incluir(passagem);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + passagem);
        return null;
    };

    // DELETE: Deletar funcionario
    public static Route excluir = (req,res) -> {
        // recuperar valor do id informado
        Integer index = Integer.parseInt(req.queryParams("id"));
        System.out.println(index);
        // recuperar funcionario
        Passagem passagem = PassagemService.obterPorId(index);

        // excluir
        PassagemService.excluir(index);

        res.redirect("/");
        //System.out.println("Apagado: " + funcionario);
        return null;

    };

    public static Route atualizar = (req, res) -> {
        Integer id = Integer.parseInt(req.queryParams("id"));
        String localChegada = req.queryParams("localChegada");
        String localPartida = req.queryParams("localPartida");
        Float Preco = Float.parseFloat( req.queryParams("preco"));
        String duracao = req.queryParams("duracao");

        Passagem passagem = new Passagem(localPartida,localChegada,Preco,duracao);


        Passagem passagemAntiga = PassagemService.obterPorId(id);
        PassagemService.atualizar(passagemAntiga, passagem);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + passagem);
        return null;
    };


}
