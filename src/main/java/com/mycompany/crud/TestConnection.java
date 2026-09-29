/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

public class TestConnection {

    public static void main(String[] args) {

        try {

            DBConnection.getConnection();

            System.out.println("DATABASE CONNECTED!");

        } catch (Exception e) {

            System.out.println("DATABASE ERROR!");
            e.printStackTrace();
        }
    }
}

