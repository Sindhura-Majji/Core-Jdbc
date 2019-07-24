package com.stackroute;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        //Retrieving Employee Details
        simpleJdbcDemo.getEmployeeDetails();
        //Retrieving Employee Details in reverse order
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        //Retrieving Employee Details in reverse order from second row
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        //Retrieving Employee Details by name and gender
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("sarah", "f");


        //Creating object for RowSet
        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.getRowSet();

        //Creating Object for JdbcBatchDemo
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
        jdbcBatchDemo.batchDemo();

        //Creating object for JdbcTransactionDemo
        JdbcTransactionDemo jdbcTransactionDemo= new JdbcTransactionDemo();
        jdbcTransactionDemo.getTransactionDemo();

        //Creating object for ResultMetadataDemo
        ResultSetMetadataDemo resultSetMetadataDemo = new ResultSetMetadataDemo();
        resultSetMetadataDemo.getResultSetMetaData();

        DatabaseMetadataDemo databaseMetadataDemo= new DatabaseMetadataDemo();
        databaseMetadataDemo.getDatabaceMetaData();
    }
}
