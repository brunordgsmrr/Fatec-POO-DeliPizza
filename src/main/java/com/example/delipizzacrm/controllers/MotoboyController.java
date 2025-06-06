package com.example.delipizzacrm.controllers;

import com.example.delipizzacrm.DAOs.ClienteDAO;
import com.example.delipizzacrm.DAOs.MotoboyDAO;
import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Motoboy;
import com.example.delipizzacrm.utils.Console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MotoboyController {

    Scanner sc;

    Motoboy motoboy = new Motoboy();
    MotoboyDAO motoboyDAO = new MotoboyDAO();

    public MotoboyController(Scanner sc){
        this.sc = sc;
    }

    public void cadastrar(){
        String nome;
        String cpf;
        String telefone;
        String placaMoto;
        String marcaMoto;
        String modeloMoto;
        String corMoto;

        System.out.println("Cadastro de MOTOBOY");

        System.out.println("Digite o nome do MOTOBOY:");
        nome = sc.nextLine();
        motoboy.setNome(nome);

        System.out.println("Digite o cpf do MOTOBOY:");
        do {
            cpf = sc.nextLine();
        } while (cpf.length() != 11);
        motoboy.setCpf(cpf);

        System.out.println("Digite o telefone do MOTOBOY:");
        telefone = sc.nextLine();
        motoboy.setTelefone(telefone);

        System.out.println("Digite  placa da moto:");
        do {
            placaMoto = sc.nextLine();
        } while (placaMoto.length() != 7);
        motoboy.setPlacaMoto(placaMoto);

        System.out.println("Digite a marca da moto:");
        marcaMoto = sc.nextLine();
        motoboy.setMarcaMoto(marcaMoto);

        System.out.println("Digite o modelo da moto:");
        modeloMoto = sc.nextLine();
        motoboy.setModeloMoto(modeloMoto);

        System.out.println("Digite a cor da moto:");
        corMoto = sc.nextLine();
        motoboy.setCorMoto(corMoto);

        try {
            motoboyDAO.cadastrar(motoboy);
            System.out.println("Cadastrado com sucesso!!");
            sc.nextLine();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void consultarTodos(){
        List<Motoboy> motoboys = motoboyDAO.consultarTodos();
        String header = String.format("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |",
                "ID Motoboy", "Nome", "CPF", "Telefone", "Placa da moto", "Marca da moto", "Modelo moto", "Cor moto");
        System.out.println(header);

        for (int i = 0; i < 145; i++){
            System.out.print("-");
        }
        System.out.println();

        for (Motoboy motoboy : motoboys){
            System.out.println(motoboy.toString());
        }

        System.out.println("\nPressione ENTER para continuar");
        sc.nextLine();
    };

    public void excluir(){
        Console.clearConsole();
        consultarTodos();
        int id;

        System.out.println("\nEXCLUIR MOTOBOY");
        System.out.println("\nDigite o ID do MOTOBOY a ser excluido");
        id = sc.nextInt();

        motoboyDAO.excluir(id);

    }




}
