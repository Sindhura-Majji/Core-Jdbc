package com.stackroute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {

    public void getTransactionDemo()
    {
        //Loading Driver Class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Establishing Connection
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Root@123");
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from employee where id=14");

            con.commit();
            con.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
