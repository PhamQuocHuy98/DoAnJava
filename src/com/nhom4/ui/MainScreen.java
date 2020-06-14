/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.ui;

import com.nhom4.database.Connect;

/**
 *
 * @author phamquochuy
 */
public class MainScreen {
    
    public static String staffRole;
    public static String StaffId;
    
    public static void main (String [] args){
        
        
        java.sql.Connection a = Connect.connectSQL();
       
        if(a != null){
            System.out.print("Thành công");
        }else{
            System.out.print("Thất bại");
        }
        
        LoginScreen  loginForm= new LoginScreen();
     
        loginForm.setLocationRelativeTo(null);
        loginForm.setVisible(true);
         

    }
}
