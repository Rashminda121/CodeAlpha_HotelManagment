/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rashminda
 */
public class ConnectionProvider {
    public static Connection getCon(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanage","root","12345678");
            return conn;
            
        }catch(Exception e){
          
            return null;
        }
    }
}
