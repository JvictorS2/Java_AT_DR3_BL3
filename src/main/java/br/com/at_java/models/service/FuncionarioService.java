package br.com.at_java.models.service;

import br.com.at_java.models.domain.Funcionario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FuncionarioService {

    // Static permite que eu use um componente(método, variável) de uma classe sem ter que instância-la

    private static Map<Integer, Funcionario> funcionarioMap = new HashMap<Integer,Funcionario>();
    private static Integer id = 0;

    // void Incluir: receber um objeto do tipo funcionários
    public static void incluir(Funcionario funcionario){

        funcionario.setId(++id);
        funcionarioMap.put(funcionario.getId(), funcionario);
    }

    // void excluir: receber a chave (id)
    public static void excluir(Integer id){
        funcionarioMap.remove(id);
    }

    // colecao de funcionarios obterLista: não recebe
    public static Collection<Funcionario> obterLista(){
        return funcionarioMap.values();
    }

    // funcionario obterPorId: receber a chave (id)
    public static Funcionario obterPorId(Integer id){
        return funcionarioMap.get(id);
    }

    public static void atualizar(Funcionario funcionarioAntigo, Funcionario funcionarioNovo){

        funcionarioAntigo.setNome(funcionarioNovo.getNome());
        funcionarioAntigo.setIdade(funcionarioNovo.getIdade());
        funcionarioAntigo.setCpf(funcionarioNovo.getCpf());
        funcionarioAntigo.setCargo(funcionarioNovo.getCargo());
        funcionarioAntigo.setEndereco(funcionarioNovo.getEndereco());
        funcionarioAntigo.setSalario(funcionarioNovo.getSalario());

        funcionarioMap.put(funcionarioAntigo.getId(),funcionarioAntigo);

    }

}
