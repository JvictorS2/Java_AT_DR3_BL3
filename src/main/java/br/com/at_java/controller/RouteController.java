package br.com.at_java.controller;

import br.com.at_java.app.app;
import spark.Route;

public class RouteController {

    // Index
    public static Route indexPage = (req, res) -> {
        return app.class.getResourceAsStream("/template/index.html");

    };

    // Cliente
    public static Route clientePageIndex = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/index.html");

    };


    public static Route clientePageCreate = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/create.html");

    };


    public static Route clientePageDelete = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/delete.html");

    };


    public static Route clientePageUpdate = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/update.html");

    };

    // Funcionario
    public static Route funcionarioPageIndex= (req, res) -> {
        return app.class.getResourceAsStream("/template/funcionario/index.html");

    };

    public static Route funcionarioPageCreate= (req, res) -> {
        return app.class.getResourceAsStream("/template/funcionario/Create.html");

    };

    public static Route funcionarioPageDelete= (req, res) -> {
        return app.class.getResourceAsStream("/template/funcionario/Delete.html");

    };

    public static Route funcionarioPageUpdate= (req, res) -> {
        return app.class.getResourceAsStream("/template/funcionario/Update.html");

    };

    public static Route funcionarioPageAdicionarPassgem= (req, res) -> {
        return app.class.getResourceAsStream("/template/funcionario/addPassagem.html");

    };

    // Endereco
    public static Route enderecoPageIndex= (req, res) -> {
        return app.class.getResourceAsStream("/template/endereco/index.html");

    };

    public static Route enderecoPageCreate= (req, res) -> {
        return app.class.getResourceAsStream("/template/endereco/create.html");

    };

    public static Route enderecoPageDelete= (req, res) -> {
        return app.class.getResourceAsStream("/template/endereco/delete.html");

    };

    public static Route enderecoPageUpdate= (req, res) -> {
        return app.class.getResourceAsStream("/template/endereco/update.html");

    };

    // Passagem
    public static Route passagemPageIndex= (req, res) -> {
        return app.class.getResourceAsStream("/template/passagem/index.html");

    };

    public static Route passagemPageCreate= (req, res) -> {
        return app.class.getResourceAsStream("/template/passagem/create.html");

    };

    public static Route passagemPageDelete= (req, res) -> {
        return app.class.getResourceAsStream("/template/passagem/delete.html");

    };

    public static Route passagemPageUpdate= (req, res) -> {
        return app.class.getResourceAsStream("/template/passagem/update.html");

    };

    // Sobre
    public static Route sobrePage = (req, res) -> {
        return app.class.getResourceAsStream("/template/sobre.html");

    };


}
