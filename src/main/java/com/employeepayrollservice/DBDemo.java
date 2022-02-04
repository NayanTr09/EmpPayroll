package com.employeepayrollservice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBDemo {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
        String userName = "root";
        String password = "Justice@24";
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");

        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        try {
            System.out.println("Connecting to database" + jdbcURL);
            con = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection is successful!!!" + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
