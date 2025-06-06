package com.example.delipizzacrm.controllers;

import com.example.delipizzacrm.DAOs.ClienteDAO;
import com.example.delipizzacrm.DAOs.MotoboyDAO;
import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Motoboy;

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
}
