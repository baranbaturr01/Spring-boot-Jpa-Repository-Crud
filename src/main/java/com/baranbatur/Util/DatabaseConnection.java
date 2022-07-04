package com.baranbatur.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "root";
    String password = "toor";
    Connection connection;


    public DatabaseConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Hata Verdi");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getDatabaseConnection() {
        return this.connection;
    }
}
