/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.database;

import java.sql.*; 
/**
 *
 * @author phamquochuy
 */
public class Connect {
    public Connection conn = null;

    public static Connection connectSQL() { 
        try {
                String userName ="root";
                String password = "root";
                String url = "jdbc:mysql://localhost/quanlycaphe?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
                Class.forName("com.mysql.jdbc.Driver");  
                
                return DriverManager.getConnection(url,userName,password);
        }catch (ClassNotFoundException e) {
           e.printStackTrace();
          // System.out.print(e);
        }catch (SQLException e){
            System.out.print(e);
        }
        return null;
    }
  
}
