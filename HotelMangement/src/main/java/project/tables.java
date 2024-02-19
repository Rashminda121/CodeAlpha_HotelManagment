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
public class tables {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try {
            
            conn=ConnectionProvider.getCon();
            st=conn.createStatement();
            String qry="create table user (name varchar(200),email varchar(200),password varchar(100),secquestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))";
            st.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "table created successfully");
            
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                 
                conn.close();
                st.close();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }
}
