/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anjal
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarynew","root","7447");
         return conn;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    public static void main(String[] args){
        
        new javaconnect();
    }
}
