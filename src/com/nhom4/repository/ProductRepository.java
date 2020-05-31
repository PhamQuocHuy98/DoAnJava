/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import com.nhom4.model.Product;
import com.nhom4.model.ProductCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author phamquochuy
 */
public class ProductRepository {
    
    
    public List<Product> getAllProduct(){
        
        Connection connection  = Connect.connectSQL();
        List<Product> lst = new ArrayList<Product>();
        
        String query = "SELECT * FROM PRODUCT";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
               
                Product product = new Product();
                product.setMa(rs.getString("masanpham"));
                product.setTen(rs.getString("tensanpham"));
                product.setGia(rs.getDouble("gia"));
                
                product.setHinhanh(rs.getString("hinhanh"));
                product.setMaLoaiSanPham(rs.getString("maloaisanpham"));
                
                lst.add(product);
            }
            
        }catch(Exception e){
            e.getStackTrace();
        }
        return lst;
    }
    
    public boolean insertProduct(){
        
        Connection connection  = Connect.connectSQL();
        String query = "SELECT * FROM PRODUCT";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
        }catch(SQLException e){
           
        }
        return false;
    }
    
    public boolean insertProductCategory(ProductCategory category){
        
        System.out.print(category.getTen());
        Connection connection  = Connect.connectSQL();
        String query = "INSERT INTO LoaiSanPham(MaLoaiSanPham,TenLoaiSanPham) VALUES (?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, category.getMa());
            
            preparedStatement.setString(2, category.getTen());
            
            
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
    }
    
}
