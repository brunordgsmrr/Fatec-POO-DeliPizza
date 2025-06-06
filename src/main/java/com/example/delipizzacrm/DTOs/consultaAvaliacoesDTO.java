package com.example.delipizzacrm.DTOs;

import com.example.delipizzacrm.models.Avaliacao;
import com.example.delipizzacrm.models.Pedido;

public class consultaAvaliacoesDTO {

    private Pedido pedido;
    private String tipoAvaliador;
    private int idAvaliador;
    private String tipoAvaliado;
    private int idAvaliado;
    private Integer nota;
    private String comentario;

    public consultaAvaliacoesDTO(Avaliacao avaliacao){

    }

}
