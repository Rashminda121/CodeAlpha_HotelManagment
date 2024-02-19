/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashminda
 */
public class Crud {
    public static void setData(String qry, String msg) {
        
        Connection conn=null;
        Statement st=null;
        
        try {
            
            //conn=ConnectionProvider.getCon();
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanage","root","12345678");
            st= conn.createStatement();
            st.executeUpdate(qry);
            
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
            
        } catch (Exception e) {
        }
    }
}
