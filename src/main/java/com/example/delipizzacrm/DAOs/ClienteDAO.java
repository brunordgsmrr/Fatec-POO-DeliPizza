package com.example.delipizzacrm.DAOs;

import com.example.delipizzacrm.models.Avaliacao;
import com.example.delipizzacrm.models.Cliente;
import com.example.delipizzacrm.models.Pedido;
import com.example.delipizzacrm.models.Pessoa;
import com.example.delipizzacrm.configs.DatabaseConnection;
import org.postgresql.util.PSQLException;

import java.sql.*;
import java.util.ArrayList;
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

    @Override
    public List<Cliente> consultarTodos(){
        String sql = "SELECT * FROM tb_cliente;";
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConexao(); Statement st = conn.createStatement()) {

            ResultSet result = st.executeQuery(sql);

            while (result.next()){

                Cliente cliente = new Cliente();

                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setTelefone(result.getString("telefone"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM tb_cliente WHERE id = ?;";

        try (Connection conn = DatabaseConnection.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
