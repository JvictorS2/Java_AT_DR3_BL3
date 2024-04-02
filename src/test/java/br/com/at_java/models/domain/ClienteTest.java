package br.com.at_java.models.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest extends Pessoa {

    private static Cliente cliente;

    @BeforeAll
    static void clienteIntance(){
        cliente = new Cliente();
    }


    @Test
    void toStringCliente(){
        assertEquals("Pessoa{nome='null', idade=0, cpf='null', endereco=null}",cliente.toString());
    }


}