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
        
        String query = "SELECT * FROM SanPham";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
               
                Product product = new Product();
                product.setMa(rs.getString("masanpham"));
                product.setTen(rs.getString("tensanpham"));
                product.setGia(rs.getDouble("gia"));
                product.setKichco(rs.getString("kichthuoc"));
                product.setHinhanh(rs.getString("hinhanh"));
                product.setMaLoaiSanPham(rs.getString("maloaisanpham"));
                
                lst.add(product);
            }
            
        }catch(SQLException e){
            e.getStackTrace();
        }
        return lst;
    }
    
    public boolean insertProduct(Product product){
        
        Connection connection  = Connect.connectSQL();
        String query = "INSERT INTO SanPham(MaSanPham,TenSanPham,Gia,HinhAnh,MaLoaiSanPham,KichThuoc) VALUES (?,?,?,?,?,?)";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, product.getMa());
            
            preparedStatement.setString(2, product.getTen());
            
            preparedStatement.setDouble(3, product.getGia());
            
            preparedStatement.setString(4, product.getHinhanh());
            
            preparedStatement.setString(5, product.getMaLoaiSanPham());
            
            preparedStatement.setString(6, product.getKichco());
            
            System.out.println(preparedStatement.toString());
            int rs = preparedStatement.executeUpdate();
            
            return true;
        }catch(SQLException e){
           e.getStackTrace();
        }
        return false;
    }
    
    public boolean updateProduct(Product product){
        
        Connection connection  = Connect.connectSQL();
        String query = "UPDATE SanPham SET TenSanPham=?,Gia=?,HinhAnh=?,MaLoaiSanPham=?,KichThuoc=? WHERE MaSanPham=?" ;
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(6, product.getMa());
            
            preparedStatement.setString(1, product.getTen());
            
            preparedStatement.setDouble(2, product.getGia());
            
            preparedStatement.setString(3, product.getHinhanh());
            
            preparedStatement.setString(4, product.getMaLoaiSanPham());
            
            preparedStatement.setString(5, product.getKichco());
            
            System.out.println(preparedStatement.toString());
            int rs = preparedStatement.executeUpdate();
             return rs != 0;
            
           
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
    }
    
    public boolean insertProductCategory(ProductCategory category){
        
      
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
    
    public boolean updateCategory(ProductCategory category){
        
        Connection connection  = Connect.connectSQL();
        String query = "UPDATE LoaiSanPham SET TenLoaiSanPham=?, WHERE MaLoaiSanPham=?" ;
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(2, category.getMa());
            
            preparedStatement.setString(1, category.getTen());
            
         
            
            System.out.println(preparedStatement.toString());
            int rs = preparedStatement.executeUpdate();
             return rs != 0;
            
           
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
    }
    public boolean updateProductCategoryById(ProductCategory category){
        
        Connection connection  = Connect.connectSQL();
        String query = "UPDATE LoaiSanPham SET TenLoaiSanPham=? WHERE MaLoaiSanPham=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, category.getTen());
            preparedStatement.setString(2, category.getMa());
           
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
       
    }
    public boolean deleteProduct(String productID){
        Connection connection  = Connect.connectSQL();
        String query = "DELETE FROM SanPham WHERE MaSanPham =?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, productID);
           
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
        
    }
    
    public List<ProductCategory> getAllProductCaregory(){
        
        
        Connection connection  = Connect.connectSQL();
        List<ProductCategory> lst = new ArrayList<ProductCategory>();
        
        String query = "SELECT * FROM LoaiSanPham";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
               
                ProductCategory product = new ProductCategory();
                product.setMa(rs.getString("maloaisanpham"));
                product.setTen(rs.getString("tenloaisanpham"));
               
                lst.add(product);
            }
            
        }catch(Exception e){
            e.getStackTrace();
        }
        return lst;
        
    }
    
    public boolean deleteProductCategoryById(String ma){
        
        Connection connection  = Connect.connectSQL();
        String query = "DELETE FROM LoaiSanPham WHERE MaLoaiSanPham =?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, ma);
           
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
        
    }
    
    
    public List<String> getSizeProductByName(String name){
        List<String> sizes = new ArrayList<>();
        String query = "SELECT KichThuoc FROM SanPham Where TenSanPham = ?";
        Connection connection  = Connect.connectSQL();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
           
            ResultSet rs = preparedStatement.executeQuery();
            
           // System.out.print(preparedStatement.toString());
            
            while(rs.next()){
               
                sizes.add(rs.getString("kichthuoc"));
            }
            return sizes;
            
        }catch(SQLException e){
            e.getStackTrace();
        }
        return sizes;
    }
    
    public Product getProductByNameAndSize(String ten,String kichthuoc){
        Product product  = new Product();
        String query = "SELECT * FROM SanPham Where TenSanPham = ? AND KichThuoc=?";
        Connection connection  = Connect.connectSQL();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, ten);
            preparedStatement.setString(2, kichthuoc);
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
                product.setMa(rs.getString("masanpham"));
                product.setTen(rs.getString("tensanpham"));
                product.setGia(rs.getDouble("gia"));
                product.setKichco(rs.getString("kichthuoc"));
                product.setHinhanh(rs.getString("hinhanh"));
                product.setMaLoaiSanPham(rs.getString("maloaisanpham"));
                
                return product;
                
            }
            
        }catch(SQLException e){
            e.getStackTrace();
        }
        return product;
    }
    
    
    
    /**
     *
     * @param categoryID
     * @return List product
     */
    public List<Product> getProductByCategoryId(String categoryID){
        
        Connection connection  = Connect.connectSQL();
        String query = "SELECT * FROM SanPham WHERE MaLoaiSanPham = ? ";
        List<Product> lst = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, categoryID);
           
           
            ResultSet rs = preparedStatement.executeQuery();
            
           while(rs.next()){
                
               
                Product product = new Product();
                product.setMa(rs.getString("masanpham"));
                product.setTen(rs.getString("tensanpham"));
                product.setGia(rs.getDouble("gia"));
                product.setKichco(rs.getString("kichthuoc"));
                product.setHinhanh(rs.getString("hinhanh"));
                product.setMaLoaiSanPham(rs.getString("maloaisanpham"));
                
                lst.add(product);
            }
            
        }catch(SQLException e){
           e.getStackTrace();
           
        }
        
        return null;
        
    }
}
