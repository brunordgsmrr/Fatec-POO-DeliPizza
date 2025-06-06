package com.example.delipizzacrm.models;

public class Pizzaria extends EntidadeDominio{

    private String telefone;
    private String nome;

    public Pizzaria(Integer id, String nome, String telefone) {
        super(id);
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
