package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Avaliacao;

import java.util.List;

public interface IAvaliacaoDAO {

    void criar(Avaliacao avaliacao);
    List<Avaliacao> consultarTodos();

}
