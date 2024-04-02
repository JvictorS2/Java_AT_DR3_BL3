package br.com.at_java.app;

import br.com.at_java.controller.ClienteController;
import br.com.at_java.controller.FuncionarioController;
import br.com.at_java.controller.PassagemController;
import br.com.at_java.controller.RouteController;
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

        // cliente
        Spark.get("/cliente/index", RouteController.clientePageIndex);

        // funcionario
        Spark.get("/funcionario/index", RouteController.funcionarioPageIndex);
        Spark.get("/funcionario/create", RouteController.funcionarioPageCreate);
        Spark.get("/funcionario/delete", RouteController.funcionarioPageDelete);
        Spark.get("/funcionario/update", RouteController.funcionarioPageUpdate);

        // clientes

        Spark.get("/cliente/index", RouteController.clientePageIndex);
        Spark.get("/cliente/create", RouteController.clientePageCreate);
        Spark.get("/cliente/delete", RouteController.clientePageDelete);
        Spark.get("/cliente/update", RouteController.clientePageUpdate);

        // sobre
        Spark.get("/sobre", RouteController.sobrePage);

        // funcionalidades

        // Funcionários
        Spark.get("/funcionario/get",FuncionarioController.obterList);
        Spark.post("/funcionario/create/submit", FuncionarioController.incluir);
        Spark.post("/funcionario/delete/submit", FuncionarioController.excluir);
        Spark.post("/funcionario/update/submit", FuncionarioController.atualizar);

        // Cliente
        Spark.get("/cliente/get", ClienteController.obterList);
        Spark.post("/cliente/create/submit", ClienteController.incluir);
        Spark.post("/cliente/delete/submit", ClienteController.excluir);
        Spark.post("/cliente/update/submit", ClienteController.atualizar);

        // Passagem
        Spark.get("/Passagem/listar", PassagemController.listar);
        List<Passagem> passagems = new ArrayList<>();

        // Todo
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));
        passagems.add(new Passagem("Aeroporto de Guarulhos","Aeroporto RJ",1000f,"0h30min"));

        PassagemService.incluir(passagems);


        //
        //Spark.post("/funcionario/submit",FuncionarioController.teste);






    }
}
