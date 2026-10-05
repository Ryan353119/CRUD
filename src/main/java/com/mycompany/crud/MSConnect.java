package com.mycompany.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MSConnect {

    public static Connection conn() {

        try {

            String url = "jdbc:ucanaccess://C:/Users/Ryan Dave/Documents/lala.accdb";

            Connection conn = DriverManager.getConnection(url);

            return conn;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                null,
                "Database Connection Error:\n" + e.getMessage()
            );

            return null;
        }
    }
}

