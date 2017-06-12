package com.knoldus;

import java.sql.*;

public class SampleApp {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Connect to the "school" database.
        try {
            // Create the "student" table.
            StudentCRUD.createTable();
            //Insert data into "student" table.
            StudentCRUD.insertStudent();
            //Select data from "student" table.
            StudentCRUD.selectStudent();
            //Delete data from "student" table.
            StudentCRUD.deleteStudent();
            System.out.println("\tPrinting student after deleting id :: 22");
            //Select data from "student" table.
            StudentCRUD.selectStudent();
            //Update data into "student" table.
            StudentCRUD.updateStudent();
            System.out.println("\tPrinting student after updating id :: 11");
            //Select data from "student" table.
            StudentCRUD.selectStudent();
    
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
    
}
