package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Pessoa;

import java.util.List;

public interface IClienteDAO {

    void cadastrar(Cliente cliente);
    void excluir(int id);
    List<Cliente> consultarTodos();
    //void editar(Cliente cliente);
    //Pessoa consultar(Cliente cliente);

}
