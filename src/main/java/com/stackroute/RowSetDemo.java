package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {

    public void getRowSet() {


        //Using Rowset to establish connection and execute a query
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            String string = "jdbc:mysql://localhost:3306/sys";
            rowSet.setUrl(string);
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");
            rowSet.setCommand("select * from employee");
            rowSet.execute();


            //Retrieving data from the Employee table
            while (rowSet.next()) {
                System.out.println("Id: " + rowSet.getInt(1) + " Name: " + rowSet.getString(2) + " age:" + rowSet.getInt(3) + " Gender: " + rowSet.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




