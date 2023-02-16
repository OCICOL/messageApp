package com.platzi.messageApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection() throws SQLException {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messageApp","root","");
            if (conection != null){
                System.out.println("Conexion Exitosa");
            };
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
