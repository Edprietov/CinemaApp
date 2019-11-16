package DAO;

/**
 * @author Edisson
 */

import java.sql.*;

public class connectionDB {

    Connection newconnection;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            newconnection = DriverManager.getConnection("jdbc:mysql://remotemysql.com/NtN4gXExvG", "NtN4gXExvG", "1kmveFh3HV");
            System.out.println("Se conecto exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return newconnection;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }

}