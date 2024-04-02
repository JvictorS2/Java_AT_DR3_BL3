package br.com.at_java.models.service;

import br.com.at_java.models.domain.Cliente;
import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EnderecoService {
    // Static permite que eu use um componente(método, variável) de uma classe sem ter que instância-la

    private static Map<Integer, Endereco> enderecoMap = new HashMap<Integer,Endereco>();

    private static Integer id = 0;

    // void Incluir: receber um objeto do tipo endereco
    public static void incluir(Endereco endereco){

        endereco.setId(++id);
        enderecoMap.put(endereco.getId(), endereco);
    }

    // void excluir: receber a chave (id)

    public static void excluir(Integer id){
        enderecoMap.remove(id);
    }

    // colecao de endereco obterLista: não recebe
    public static Collection<Endereco> obterLista(){
        return enderecoMap.values();
    }

    // endereco obterPorId: receber a chave (id)
    public static Endereco obterPorId(Integer id){
        return enderecoMap.get(id);
    }

    public static void atualizar(Endereco enderecoAntigo, Endereco enderecoNovo){

        enderecoAntigo.setRua(enderecoNovo.getRua());
        enderecoAntigo.setBairro(enderecoNovo.getBairro());
        enderecoAntigo.setCidade(enderecoNovo.getCidade());

        enderecoMap.put(enderecoAntigo.getId(),enderecoAntigo);

    }
}
