package com.example.delipizzacrm;

import com.example.delipizzacrm.controllers.ClienteController;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCliente {

    @Test
    public void testeCadastroCliente() {
        ClienteController clienteController = new ClienteController();
        String entradaDados = "1\nbruno\n12345678901\nrua a\n11123456789\n";
        InputStream stdinOriginal = System.in;

        try {
            ByteArrayInputStream  input = new ByteArrayInputStream(entradaDados.getBytes());
            System.setIn(input);
            assertEquals("Cadastrado com sucesso!!", clienteController.cadastrar());
        } finally {
            System.setIn(stdinOriginal);
        }
    }
}
