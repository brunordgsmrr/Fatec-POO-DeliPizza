package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.configs.DatabaseConnection;
import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Motoboy;
import com.example.delipizzacrm.models.Pessoa;

import java.sql.*;
import java.util.ArrayList;
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
    public void excluir(int id) {
        String sql = "DELETE FROM tb_motoboy WHERE id = ?;";

        try (Connection conn = DatabaseConnection.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Motoboy> consultarTodos() {
        String sql = "SELECT * FROM tb_motoboy;";
        List<Motoboy> motoboys = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConexao(); Statement st = conn.createStatement()) {

            ResultSet result = st.executeQuery(sql);

            while (result.next()){

                Motoboy motoboy = new Motoboy();

                motoboy.setId(result.getInt("id"));
                motoboy.setNome(result.getString("nome"));
                motoboy.setCpf(result.getString("cpf"));
                motoboy.setTelefone(result.getString("telefone"));

                motoboy.setPlacaMoto(result.getString("placa_moto"));
                motoboy.setMarcaMoto(result.getString("marca_moto"));
                motoboy.setModeloMoto(result.getString("modelo_moto"));
                motoboy.setCorMoto(result.getString("cor_moto"));

                motoboys.add(motoboy);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return motoboys;
    }
}
