package com.example.delipizzacrm.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://192.168.200.79:5432/db_pizzaria";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
