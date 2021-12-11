package edu.neu.csye6200.util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hiral
 */
public class DatabaseUtil {
    private Connection connection;
    private Statement stmt = null;
    
    public DatabaseUtil(){
        try{
        Class.forName("org.sqlite.JDBC");
        //connection = DriverManager.getConnection();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Opened database successfully");
        }
}
