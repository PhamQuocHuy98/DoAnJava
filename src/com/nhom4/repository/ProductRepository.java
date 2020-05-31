/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import com.nhom4.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author phamquochuy
 */
public class ProductRepository {
    public List<Product> getAllProduct(){
        
        List<Product> lst = new ArrayList<Product>();
        Connection connection  = Connect.connectSQL();
        
        String query = "SELECT * FROM PRODUCT";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            
        }catch(Exception e){
            
        }
        return lst;
    }
}
