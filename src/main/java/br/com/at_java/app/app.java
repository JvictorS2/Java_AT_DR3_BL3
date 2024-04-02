package br.com.at_java.app;

import br.com.at_java.controller.*;
import br.com.at_java.models.domain.Cliente;
import br.com.at_java.models.domain.Passagem;
import br.com.at_java.models.service.PassagemService;
import spark.Route;
import spark.Spark;

import java.util.ArrayList;
import java.util.List;


public class app {
    public static void main(String[] args) {

        // Porta onde será executado a aplicação
        Spark.port(8080);

        // Configura a localização dos arquivos estáticos.
        Spark.staticFiles.location("/public");

        // Caminho para as páginas
        Spark.get("/", RouteController.indexPage);

        // funcionario
        Spark.get("/funcionario/index", RouteController.funcionarioPageIndex);
        Spark.get("/funcionario/create", RouteController.funcionarioPageCreate);
        Spark.get("/funcionario/delete", RouteController.funcionarioPageDelete);
        Spark.get("/funcionario/update", RouteController.funcionarioPageUpdate);
        Spark.get("/funcionario/create/ClientePassagem", RouteController.funcionarioPageAdicionarPassgem);

        // clientes

        Spark.get("/cliente/index", RouteController.clientePageIndex);
        Spark.get("/cliente/create", RouteController.clientePageCreate);
        Spark.get("/cliente/delete", RouteController.clientePageDelete);
        Spark.get("/cliente/update", RouteController.clientePageUpdate);

        // endereco
        Spark.get("/endereco/index", RouteController.enderecoPageIndex);
        Spark.get("/endereco/create", RouteController.enderecoPageCreate);
        Spark.get("/endereco/delete", RouteController.enderecoPageDelete);
        Spark.get("/endereco/update", RouteController.enderecoPageUpdate);

        // Passagem
        Spark.get("/passagem/index", RouteController.passagemPageIndex);
        Spark.get("/passagem/create", RouteController.passagemPageCreate);
        Spark.get("/passagem/delete", RouteController.passagemPageDelete);
        Spark.get("/passagem/update", RouteController.passagemPageUpdate);

        // sobre
        Spark.get("/sobre", RouteController.sobrePage);


        // funcionalidades

        // Funcionários
        Spark.get("/funcionario/get",FuncionarioController.obterList);
        Spark.post("/funcionario/create/submit", FuncionarioController.incluir);
        Spark.post("/funcionario/delete/submit", FuncionarioController.excluir);
        Spark.post("/funcionario/update/submit", FuncionarioController.atualizar);
        Spark.post("/funcionario/create/ClientePassagem/submit", FuncionarioController.adicionarPassagemCliente);

        // Cliente
        Spark.get("/cliente/get", ClienteController.obterList);
        Spark.post("/cliente/create/submit", ClienteController.incluir);
        Spark.post("/cliente/delete/submit", ClienteController.excluir);
        Spark.post("/cliente/update/submit", ClienteController.atualizar);

        // Endereço
        Spark.get("/endereco/get", EnderecoController.obterList);
        Spark.post("/endereco/create/submit", EnderecoController.incluir);
        Spark.post("/endereco/delete/submit", EnderecoController.excluir);
        Spark.post("/endereco/update/submit", EnderecoController.atualizar);

        // Passagem
        Spark.get("/passagem/get", PassagemController.obterList);
        Spark.post("/passagem/create/submit", PassagemController.incluir);
        Spark.post("/passagem/delete/submit", PassagemController.excluir);
        Spark.post("/passagem/update/submit", PassagemController.atualizar);
        List<Passagem> passagems = new ArrayList<>();


        passagems.add(new Passagem("Guarulhos","Heathrow ",2000f,"2h30min"));
        passagems.add(new Passagem("Guarulhos","Rio de Janeiro",1000f,"0h30min"));
        passagems.add(new Passagem("Guarulhos","Dubai ",8000f,"7h30min"));

        PassagemService.incluirLista(passagems);









    }
}
