/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Connector;

/**
 *
 * @author ayodr
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    private static Connection con;
    private static DBConnect dbcon;
    
    private static String url = "jdbc:mysql://localhost:3306/patient";
    private static String user = "root";
    private static String password = "";
        
    
    public DBConnect(){
        con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connection Successful!");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
 
    }
     public static DBConnect getDBConnect(){
         if(dbcon == null){
             dbcon = new DBConnect();
         }
            return dbcon;
        }
     public static Connection getConnection(){
            return con;
     }
    
        
}