package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Avaliacao;
import com.example.delipizzacrm.models.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Avaliacao> consultarTodos(){
        String sql = "SELECT * FROM tb_avaliacoes;";
        List<Avaliacao> avaliacaos = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConexao(); Statement st = conn.createStatement()) {

            ResultSet result = st.executeQuery(sql);

            while (result.next()){

                Avaliacao avaliacao = new Avaliacao();
                Pedido pedido = new Pedido();

                pedido.setId(result.getInt("pedido_id"));

                avaliacao.setPedido(pedido);
                avaliacao.setTipoAvaliador(result.getString("avaliador"));
                avaliacao.setIdAvaliador(result.getInt("avaliador_id"));
                avaliacao.setTipoAvaliado(result.getString("avaliado"));
                avaliacao.setIdAvaliado(result.getInt("avaliado_id"));
                avaliacao.setNota(result.getInt("nota"));
                avaliacao.setComentario(result.getString("comentario"));

                avaliacaos.add(avaliacao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return avaliacaos;
    }

}
