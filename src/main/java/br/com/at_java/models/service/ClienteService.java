package br.com.at_java.models.service;

import br.com.at_java.models.domain.Cliente;
import br.com.at_java.models.domain.Endereco;
import br.com.at_java.models.domain.Funcionario;
import br.com.at_java.models.domain.Passagem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteService {
    // Static permite que eu use um componente(método, variável) de uma classe sem ter que instância-la

    private static Map<Integer, Cliente> clienteMap = new HashMap<Integer,Cliente>();

    private static Integer id = 0;

    // void Incluir: receber um objeto do tipo endereco
    public static void incluir(Cliente cliente){

        cliente.setId(++id);
        clienteMap.put(cliente.getId(), cliente);
    }

    // void excluir: receber a chave (id)

    public static void excluir(Integer id){
        clienteMap.remove(id);
    }

    // colecao de endereco obterLista: não recebe
    public static Collection<Cliente> obterLista(){
        return clienteMap.values();
    }

    // endereco obterPorId: receber a chave (id)
    public static Cliente obterPorId(Integer id){
        return clienteMap.get(id);
    }


    public static void atualizar(Cliente clienteAntigo, Cliente clienteNovo){

        clienteAntigo.setNome(clienteNovo.getNome());
        clienteAntigo.setIdade(clienteNovo.getIdade());
        clienteAntigo.setCpf(clienteNovo.getCpf());
        clienteAntigo.setTelefone(clienteNovo.getTelefone());
        clienteAntigo.setEndereco(clienteNovo.getEndereco());
        clienteAntigo.setEmail(clienteNovo.getEmail());

        clienteMap.put(clienteAntigo.getId(),clienteAntigo);

    }
}
