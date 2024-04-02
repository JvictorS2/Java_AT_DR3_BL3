package br.com.at_java.models.service;

import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.domain.Passagem;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassagemService {

    private static  Map<Integer, Passagem> passagemMap = new HashMap<Integer,Passagem>();

    private static Integer id = 0;

    // void Incluir: receber um objeto do tipo funcionários
    public static void incluir(List<Passagem> passagem){

        for(int i=0; i < passagem.size(); i++){
            passagem.get(i).setId(++id);
            passagemMap.put(passagem.get(i).getId(), passagem.get(i));
        }



    }

    // colecao de funcionarios obterLista: não recebe
    public static Collection<Passagem> obterLista(){
        return passagemMap.values();
    }
}
