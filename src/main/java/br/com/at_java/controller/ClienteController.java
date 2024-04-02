package br.com.at_java.controller;

import br.com.at_java.models.domain.Aeroporto;
import br.com.at_java.models.domain.Cliente;
import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.service.ClienteService;
import br.com.at_java.models.service.FuncionarioService;
import spark.Route;

public class ClienteController {

    // GET: recuperar lista de clientes
    public static Route obterList = (req, res) -> {
        return ClienteService.obterLista();

    };

    // GET: recuperar lista de clientes
    public static Route obterPorId = (req, res) -> {
        // recuperar valor do id informado
        Integer index = Integer.valueOf(req.params(("id")));

        // recuperar funcionario
        return ClienteService.obterPorId(index);


    };

    public static Route incluir = (req, res) -> {
        // campos
        String nome = req.queryParams("nome");
        Integer idade = Integer.parseInt(req.queryParams("idade"));
        String telefone = req.queryParams("telefone");
        String email = req.queryParams("email");
        String cpf = req.queryParams("cpf");

        // endereco
        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco endereco = new Endereco(rua,bairro,cidade);

        //testes
        //System.out.println(req.queryParams("cargo"));
        //System.out.println(req.queryParams("salario"));

        Cliente cliente = new Cliente(nome,idade,cpf,endereco,email,telefone);
        ClienteService.incluir(cliente);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + cliente);
        return null;
    };

    public static Route excluir = (req,res) -> {
        // recuperar valor do id informado
        Integer index = Integer.parseInt(req.queryParams("id"));
        System.out.println(index);
        // recuperar funcionario
        Cliente cliente = ClienteService.obterPorId(index);

        // excluir
        ClienteService.excluir(index);

        res.redirect("/");
        //System.out.println("Apagado: " + funcionario);
        return null;

    };

    public static Route atualizar = (req, res) -> {
        // campos
        Integer id = Integer.parseInt(req.queryParams("id"));
        String nome = req.queryParams("nome");
        Integer idade = Integer.parseInt(req.queryParams("idade"));
        String telefone = req.queryParams("telefone");
        String email = req.queryParams("email");
        String cpf = req.queryParams("cpf");

        // endereco
        String rua = req.queryParams("rua");
        String bairro = req.queryParams("bairro");
        String cidade = req.queryParams("cidade");

        Endereco endereco = new Endereco(rua,bairro,cidade);

        //testes
        //System.out.println(req.queryParams("cargo"));
        //System.out.println(req.queryParams("salario"));

        Cliente clienteAntigo = ClienteService.obterPorId(id);
        Cliente clienteNovo = new Cliente(nome,idade,cpf,endereco,email,telefone);
        ClienteService.atualizar(clienteAntigo,clienteNovo);

        // Aqui, você pode fazer o que precisa com os dados recebidos, como salvar em um banco de dados
        res.redirect("/");
        System.out.println("adicionado: " + clienteAntigo);
        return null;
    };
}
