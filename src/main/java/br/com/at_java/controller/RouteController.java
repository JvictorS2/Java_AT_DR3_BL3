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

    // Cliente
    public static Route clientePageCreate = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/create.html");

    };

    // Cliente
    public static Route clientePageDelete = (req, res) -> {
        return app.class.getResourceAsStream("/template/cliente/delete.html");

    };

    // Cliente
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

    // Sobre
    public static Route sobrePage = (req, res) -> {
        return app.class.getResourceAsStream("/template/sobre.html");

    };


}
