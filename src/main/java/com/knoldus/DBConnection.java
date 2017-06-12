package com.knoldus;

import java.sql.*;

public class DBConnection {
    
    
    private static DBConnection dbInstance;
    private static Connection con ;
    
    
    private DBConnection() {
        // private constructor //
    }
    
    public static DBConnection getInstance(){
        if(dbInstance==null){
            dbInstance= new DBConnection();
        }
        return dbInstance;
    }
    
    public  Connection getConnection(){
        
        if(con==null){
            String url= "jdbc:postgresql://127.0.0.1:26257/";
            String dbName = "school?sslmode=disable";
            String driver = "org.postgresql.Driver";
            String userName = "testuser";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                this.con = DriverManager.getConnection(url+dbName,userName,password);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        return con;
    }
}
