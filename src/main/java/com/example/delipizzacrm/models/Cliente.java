package com.example.delipizzacrm.models;

public class Cliente extends Pessoa{

    private String endereco;

    public Cliente (){}

    public Cliente(Integer id){
        super(id);
    };

    public Cliente(Integer id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("| %-15d | %-15s | %-15s | %-15s | %-15s |", getId(), getNome(), getCpf(), endereco, getTelefone());
    }
}
