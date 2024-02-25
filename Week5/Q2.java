package com.prajwal.week5;

import java.sql.Connection;
import java.sql.DriverManager;

public class Q2 {
    // This class will be used whenever we want to create connection to our dB
    private static Connection conn;

    public static Connection getConnection(String username,String password){

        try {
            if (conn==null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/LocalInstance";

                conn = DriverManager.getConnection(url,username,password);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
