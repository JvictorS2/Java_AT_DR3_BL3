package br.com.at_java.models.service;

import br.com.at_java.models.domain.Aeroporto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AeroportoService {
    // Static permite que eu use um componente(método, variável) de uma classe sem ter que instância-la

    private static Map<Integer, Aeroporto> aeroportoService = new HashMap<Integer,Aeroporto>();

    private static Integer id = 0;

    // void Incluir: receber um objeto do tipo endereco
    public static void incluir(Aeroporto aeroporto){

        aeroporto.setId(++id);
        aeroportoService.put(aeroporto.getId(), aeroporto);
    }

    // void excluir: receber a chave (id)

    public static void excluir(Integer id){
        aeroportoService.remove(id);
    }

    // colecao de endereco obterLista: não recebe
    public static Collection<Aeroporto> obterLista(){
        return aeroportoService.values();
    }

    // endereco obterPorId: receber a chave (id)
    public static Aeroporto obterPorId(Integer id){
        return aeroportoService.get(id);
    }

}
