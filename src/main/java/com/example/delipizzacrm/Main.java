package com.example.delipizzacrm;

import com.example.delipizzacrm.controllers.AvaliacoesController;
import com.example.delipizzacrm.controllers.ClienteController;
import com.example.delipizzacrm.controllers.MotoboyController;
import com.example.delipizzacrm.controllers.PedidoController;
import com.example.delipizzacrm.utils.Console;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ClienteController clienteController = new ClienteController(sc);
        MotoboyController motoboyController = new MotoboyController(sc);
        AvaliacoesController avaliacoesController = new AvaliacoesController(sc);
        PedidoController pedidoController = new PedidoController(sc);

        int selection;

        do {
            Console.clearConsole();
            System.out.println("======================");
            System.out.println("[1] Cadastrar cliente");
            System.out.println("[2] Consultar clientes");
            // System.out.println("[3] Editar clientes");
            System.out.println("[4] Excluir clientes");

            System.out.println("[5] Cadastrar motoboy");
            System.out.println("[6] Consultar motoboys");
            //System.out.println("[7] Editar motoboy");
            System.out.println("[8] Excluir motoboy");

            System.out.println("[9] Nova avaliação");
            System.out.println("[10] Consultar avaliações");

            //System.out.println("[11] Novo pedido");
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
                    clienteController.consultarTodos();
                    break;
                case 4:
                    clienteController.excluir();
                    break;
                case 5:
                    motoboyController.cadastrar();
                    break;
                case 6:
                    motoboyController.consultarTodos();
                    break;
                case 8:
                    motoboyController.excluir();
                    break;
                case 9:
                    avaliacoesController.novaAvaliacao();
                    break;
                case 10:
                    avaliacoesController.consultarTodas();
                    break;
            }


        } while (selection != 0);

        System.out.println("Encerrando programa");

        sc.close();

    }
}
