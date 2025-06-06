package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {

    public void novo(Pedido pedido){
        String sql = "INSERT INTO tb_pedido(descricao, cliente_id, motoboy_id, campanha_id) VALUES (?, ?, ?, ?);";

        try(Connection conn = DatabaseConnection.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            System.out.println("");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
