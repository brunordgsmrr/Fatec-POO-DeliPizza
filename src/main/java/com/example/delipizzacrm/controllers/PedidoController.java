package com.example.delipizzacrm.controllers;

import com.example.delipizzacrm.DAOs.PedidoDAO;

import java.util.Scanner;

public class PedidoController {

    Scanner sc;

    PedidoDAO pedidoDAO = new PedidoDAO();

    public PedidoController(Scanner sc){
        this.sc = sc;
    }

    public void novo(){
        System.out.println("-");
    }

}
