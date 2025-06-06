package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Motoboy;
import com.example.delipizzacrm.models.Pessoa;

import java.util.List;

public interface IMotoboyDAO {

    void cadastrar(Motoboy motoboy);
    void editar(Motoboy motoboy);
    void deletar(Motoboy motoboy);
    Pessoa consultar(Motoboy motoboy);
    List<Pessoa> consultarTodos(Motoboy motoboy);
}
