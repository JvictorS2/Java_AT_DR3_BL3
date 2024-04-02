package br.com.at_java.models.service;

import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.domain.Passagem;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassagemService {

    private static  Map<Integer, Passagem> passagemMap = new HashMap<Integer,Passagem>();

    private static Integer id = 0;

    // void IncluirListar: inclui uma lista de passagem
    public static void incluirLista(List<Passagem> passagem){

        for(int i=0; i < passagem.size(); i++){
            passagem.get(i).setId(++id);
            passagemMap.put(passagem.get(i).getId(), passagem.get(i));
        }

    }

    public static void incluir(Passagem passagem){
        passagem.setId(++id);
        passagemMap.put(passagem.getId(),passagem);
    }

    // colecao de funcionarios obterLista: não recebe
    public static Collection<Passagem> obterLista(){
        return passagemMap.values();
    }

    // void excluir: receber a chave (id)
    public static void excluir(Integer id){
        passagemMap.remove(id);
    }

    public static Passagem obterPorId(Integer id){
        return passagemMap.get(id);
    }

    public static void atualizar(Passagem passagemAntiga, Passagem passagemNova){

        passagemAntiga.setLocalChegada(passagemNova.getLocalChegada());
        passagemAntiga.setLocalPartida(passagemNova.getLocalPartida());
        passagemAntiga.setPreco(passagemNova.getPreco());
        passagemAntiga.setHorario(passagemNova.getHorario());

        passagemMap.put(passagemAntiga.getId(),passagemAntiga);

    }
}
