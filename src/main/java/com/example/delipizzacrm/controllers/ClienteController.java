package com.example.delipizzacrm.controllers;

import com.example.delipizzacrm.DAOs.ClienteDAO;
import com.example.delipizzacrm.models.Cliente;

import java.sql.SQLException;
import java.util.Scanner;

public class ClienteController {

    Scanner sc;
    Cliente cliente;
    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteController(Scanner sc){
        this.sc = sc;
    }

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        cliente = new Cliente();
        String nome;
        String cpf;
        String endereco;
        String telefone;

        clearConsole();
        System.out.println("======================");
        System.out.println("Cadastro de CLIENTE");
        System.out.println("======================");

        System.out.println("Digite o nome do cliente:");
        nome = sc.nextLine();
        cliente.setNome(nome);

        System.out.println("Digite o cpf do cliente:");
        do {
            cpf = sc.nextLine();
        } while (cpf.length() != 11);
        cliente.setCpf(cpf);

        System.out.println("Digite o endereço do cliente:");
        endereco = sc.nextLine();
        cliente.setEndereco(endereco);

        System.out.println("Digite o telefone do cliente:");
        telefone = sc.nextLine();
        cliente.setTelefone(telefone);

        try {
            clienteDAO.cadastrar(cliente);
            System.out.println("Cadastrado com sucesso!!\nPressione ENTER para continuar");
            sc.nextLine();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void clearConsole(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
