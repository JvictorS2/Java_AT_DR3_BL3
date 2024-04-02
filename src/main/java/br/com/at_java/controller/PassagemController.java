package br.com.at_java.controller;

import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.domain.Passagem;
import br.com.at_java.models.service.FuncionarioService;
import br.com.at_java.models.service.PassagemService;
import spark.Route;

import java.util.ArrayList;
import java.util.List;

public class PassagemController {


    //POST: incluir funcionario
    public static Route listar= (req,res) -> {



        return PassagemService.obterLista();
    };


}
