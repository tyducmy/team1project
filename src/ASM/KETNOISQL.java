/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author Tyler
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class KETNOISQL {
    private static Connection conn;
    public static Connection
            getConnection(String user, String pass, String database){
                Connection conn = null;
                 try {
            String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=employees;encrypt=false";
             conn = DriverManager.getConnection(url,user,pass);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                 return conn;
                        };
       
    }
