/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author HINH
 */
public class LoginRepository {

    public boolean login(String name, String pass){
        Connection connection  = Connect.connectSQL();
        String query = "SELECT PHANQUYEN FROM NHANVIEN WHERE MANHANVIEN =? AND MATKHAU=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);
           
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
          
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
    }
    
    public String rules(String ma){
        Connection connection = Connect.connectSQL();
        String query = "SELECT PHANQUYEN FROM NHANVIEN WHERE MANHANVIEN=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
            preparedStatement.setString (1, ma);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                int phanquyen = rs.getInt("phanquyen");
                String a = String.valueOf(phanquyen);
                return a;
            }
            return "";
        }catch(SQLException e){
           e.getStackTrace();
        }
        return "";
    }

}
