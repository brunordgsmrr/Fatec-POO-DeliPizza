package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Motoboy;
import com.example.delipizzacrm.models.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MotoboyDAO implements IMotoboyDAO{
    @Override
    public void cadastrar(Motoboy motoboy) {
        String sql = """
                INSERT INTO tb_motoboy(nome, cpf, telefone, placa_moto, marca_moto, modelo_moto, cor_moto)
                VALUES (?, ?, ?, ?, ?, ?, ?);
                """;

        try (Connection conn = DatabaseConnection.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, motoboy.getNome());
            stmt.setString(2, motoboy.getCpf());
            stmt.setString(3, motoboy.getTelefone());
            stmt.setString(4, motoboy.getPlacaMoto());
            stmt.setString(5, motoboy.getMarcaMoto());
            stmt.setString(6, motoboy.getModeloMoto());
            stmt.setString(7, motoboy.getCorMoto());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void editar(Motoboy motoboy) {

    }

    @Override
    public void deletar(Motoboy motoboy) {

    }

    @Override
    public Pessoa consultar(Motoboy motoboy) {
        return null;
    }

    @Override
    public List<Pessoa> consultarTodos(Motoboy motoboy) {
        return List.of();
    }
}
