package com.example.delipizzacrm.models;

public abstract class Pessoa extends EntidadeDominio{

    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(){}

    public Pessoa(Integer id){
        super(id);
    };

    public Pessoa(Integer id, String nome, String cpf, String telefone) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
