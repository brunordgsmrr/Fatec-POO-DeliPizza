package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Avaliacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AvaliacaoDAO {

    public void novaAvaliacao(Avaliacao avaliacao){
        String sql = """
                INSERT INTO tb_avaliacoes(pedido_id, avaliador, avaliador_id, avaliado, avaliado_id, nota, comentario)
                VALUES (?, ?, ?, ?, ?, ?, ?);
                """;

        try (Connection conn = DatabaseConnection.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, avaliacao.getPedido().getId());
            stmt.setString(2, avaliacao.getTipoAvaliador());
            stmt.setInt(3, avaliacao.getIdAvaliador());
            stmt.setString(4, avaliacao.getTipoAvaliado());
            stmt.setInt(5, avaliacao.getIdAvaliado());
            stmt.setInt(6, avaliacao.getNota());
            stmt.setString(7, avaliacao.getComentario());
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
