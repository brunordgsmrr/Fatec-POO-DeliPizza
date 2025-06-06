package com.example.delipizzacrm.controllers;

import com.example.delipizzacrm.DAOs.AvaliacaoDAO;
import com.example.delipizzacrm.models.Avaliacao;
import com.example.delipizzacrm.models.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvaliacoesController {

    Scanner sc;
    Avaliacao avaliacao;
    Pedido pedido;
    AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();

    public AvaliacoesController(Scanner sc){
        this.sc = sc;
    }

    public void novaAvaliacao(){

        List<String> options = new ArrayList<>();
        options.add("Pizzaria");
        options.add("Cliente");
        options.add("Motoboy");

        int selection;
        String avaliador;
        int idAvaliador;
        String avaliado;
        int idAvaliado;
        int numPedido;
        String comentario;
        int nota;

        clearConsole();
        System.out.println("======================");
        System.out.println("        AVALIAÇÕES    ");
        System.out.println("======================");

        // SELECIONANDO O AVALIADOR
        System.out.println("Selecione irá AVALIAR:");
        do {
            for (int i = 0; i < options.size(); i++){
                System.out.println((i+1) + " - " + options.get(i));
            }

            selection = sc.nextInt();
        } while(selection < 1 || selection > options.size());

        avaliador = options.get(selection-1);
        options.remove(avaliador);

        System.out.println("Digite a ID do " + avaliador + ":");
        idAvaliador = sc.nextInt();

        // SELECIONANDO O AVALIADO
        System.out.println("Selecione quem será AVALIADO:");
        do {
            for (int i = 0; i < options.size(); i++){
                System.out.println((i+1) + " - " + options.get(i));
            }

            selection = sc.nextInt();
        } while(selection < 1 || selection > options.size());

        avaliado = options.get(selection-1);
        options.remove(avaliado);

        System.out.println("Digite a ID do " + avaliado + ":");
        idAvaliado = sc.nextInt();

        // SELECIONANDO O PEDIDO
        System.out.println("Digite o numero do pedido:");
        numPedido = sc.nextInt();
        sc.nextLine();

        // DIGITANDO O COMENTARIO
        System.out.println("Digite seu comentario:");
        comentario = sc.nextLine();

        // DIGITANDO a NOTA
        System.out.println("Digite uma nota de 0 a 5:");
        nota = sc.nextInt();

        avaliacao = new Avaliacao();
        pedido = new Pedido();

        avaliacao.setTipoAvaliador(avaliador);
        avaliacao.setIdAvaliador(idAvaliador);

        avaliacao.setTipoAvaliado(avaliado);
        avaliacao.setIdAvaliado(idAvaliado);

        pedido.setId(numPedido);
        avaliacao.setPedido(pedido);
        avaliacao.setComentario(comentario);
        avaliacao.setNota(nota);

        avaliacaoDAO.novaAvaliacao(avaliacao);
    }



    public void consultarTodas() {
        List<Avaliacao> avaliacaos = avaliacaoDAO.consultarTodos();

        for (Avaliacao avaliacao : avaliacaos){
            System.out.println(avaliacao.toString());
        }

        System.out.println("\nPressione ENTER para continuar");
        sc.nextLine();
    }

    public static void clearConsole(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
