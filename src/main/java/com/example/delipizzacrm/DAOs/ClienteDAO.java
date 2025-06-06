package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Pessoa;
import com.example.delipizzacrm.configs.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    @Override
    public void cadastrar(Cliente cliente) {

        String sql = "INSERT INTO tb_cliente(nome, cpf, telefone, endereco) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEndereco());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
