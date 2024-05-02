package controllers;

import java.sql.*; 

public class BankConnection {
    
    private final Connection connection;
    
    private final String url = "jdbc:mysql://localhost:3306/bank_db";
    private final String hostusername = "root";
    private final String hostpassword = "";

    public BankConnection() throws SQLException{
      
        this.connection = DriverManager.getConnection(url, hostusername, hostpassword);
       
    }
    
    public Connection getConnection() {       
        return this.connection;     
    }
    
}
