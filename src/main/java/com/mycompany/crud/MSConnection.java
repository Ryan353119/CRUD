/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MSConnection {

    public static Connection conn() {
        try {

            String url = "jdbc:ucanaccess://C:/Users/CL2-PC/Documents/CRUD.accdb";

            return DriverManager.getConnection(url);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                null,
                "Database Error: " + e.getMessage()
            );

            return null;
        }
    }
}

