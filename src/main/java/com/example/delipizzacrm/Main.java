package com.example.delipizzacrm;

import com.example.delipizzacrm.controllers.AvaliacoesController;
import com.example.delipizzacrm.controllers.ClienteController;
import com.example.delipizzacrm.controllers.MotoboyController;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ClienteController clienteController = new ClienteController(sc);
        MotoboyController motoboyController = new MotoboyController(sc);
        AvaliacoesController avaliacoesController = new AvaliacoesController(sc);

        int selection;

        do {
            clearConsole();
            System.out.println("======================");
            System.out.println("[1] Cadastrar cliente");
            System.out.println("[2] Cadastrar motoboy");
            System.out.println("[3] Nova avaliação");
            System.out.println("[4] Consultar avaliações");
            System.out.println("\n[0] Sair");
            System.out.println("======================");
            System.out.println("\nDigite o numero da opção desejada:");

            selection = sc.nextInt();
            sc.nextLine();

            switch (selection){
                case 1:
                    clienteController.cadastrar();
                    break;
                case 2:
                    motoboyController.cadastrar();
                    break;
                case 3:
                    avaliacoesController.novaAvaliacao();
                    break;
                case 4:
                    avaliacoesController.consultarTodas();
                    break;
            }


        } while (selection != 0);

        System.out.println("Encerrando programa");

        sc.close();

    }

    public static void clearConsole(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
