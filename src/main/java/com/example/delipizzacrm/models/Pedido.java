package com.example.delipizzacrm.models;

import java.time.LocalDate;

public class Pedido {

    private int id;
    private String descricao;
    private Cliente cliente;
    private Motoboy entregador;
    private LocalDate dtPedido;

    public Pedido(){

    };

    public Pedido(String descricao, Cliente cliente, LocalDate dtPedido) {
        this.descricao = descricao;
        this.cliente = cliente;
        this.dtPedido = dtPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Motoboy getEntregador() {
        return entregador;
    }

    public void setEntregador(Motoboy entregador) {
        this.entregador = entregador;
    }

    public LocalDate getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(LocalDate dtPedido) {
        this.dtPedido = dtPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
