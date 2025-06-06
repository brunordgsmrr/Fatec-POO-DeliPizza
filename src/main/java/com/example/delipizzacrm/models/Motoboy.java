package com.example.delipizzacrm.models;

public class Motoboy extends Pessoa{

    private String placaMoto;
    private String marcaMoto;
    private String modeloMoto;
    private String corMoto;

    public Motoboy(){

    }

    public Motoboy (Integer id ){
        super(id);
    }

    public Motoboy(Integer id, String nome, String cpf,
                   String placaMoto, String marcaMoto,
                   String modeloMoto, String corMoto, String telefone) {
        super(id, nome, cpf, telefone);
        this.placaMoto = placaMoto;
        this.marcaMoto = marcaMoto;
        this.modeloMoto = modeloMoto;
        this.corMoto = corMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    public String getMarcaMoto() {
        return marcaMoto;
    }

    public void setMarcaMoto(String marcaMoto) {
        this.marcaMoto = marcaMoto;
    }

    public String getModeloMoto() {
        return modeloMoto;
    }

    public void setModeloMoto(String modeloMoto) {
        this.modeloMoto = modeloMoto;
    }

    public String getCorMoto() {
        return corMoto;
    }

    public void setCorMoto(String corMoto) {
        this.corMoto = corMoto;
    }

    @Override
    public String toString() {
        return String.format("| %-15d | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |",
                getId(), getNome(), getCpf(), getTelefone(), placaMoto, marcaMoto, modeloMoto, corMoto);
    }
}

