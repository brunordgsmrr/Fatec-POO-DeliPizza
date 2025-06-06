package com.example.delipizzacrm.models;

public class Avaliacao {

    private Pedido pedido;
    private String tipoAvaliador;
    private int idAvaliador;
    private String tipoAvaliado;
    private int idAvaliado;
    private Integer nota;
    private String comentario;

    public Avaliacao() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getTipoAvaliador() {
        return tipoAvaliador;
    }

    public void setTipoAvaliador(String tipoAvaliador) {
        this.tipoAvaliador = tipoAvaliador;
    }

    public int getIdAvaliador() {
        return idAvaliador;
    }

    public void setIdAvaliador(int idAvaliador) {
        this.idAvaliador = idAvaliador;
    }

    public String getTipoAvaliado() {
        return tipoAvaliado;
    }

    public void setTipoAvaliado(String tipoAvaliado) {
        this.tipoAvaliado = tipoAvaliado;
    }

    public int getIdAvaliado() {
        return idAvaliado;
    }

    public void setIdAvaliado(int idAvaliado) {
        this.idAvaliado = idAvaliado;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
