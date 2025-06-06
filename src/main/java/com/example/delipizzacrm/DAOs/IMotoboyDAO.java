package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Motoboy;
import com.example.delipizzacrm.models.Pessoa;

import java.util.List;

public interface IMotoboyDAO {

    void cadastrar(Motoboy motoboy);
    void excluir(int id);
    List<Motoboy> consultarTodos();
    //void editar(Motoboy motoboy);
    //Pessoa consultar(Motoboy motoboy);
}
