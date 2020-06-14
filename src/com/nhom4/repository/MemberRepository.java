/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import com.nhom4.model.Member;
import com.nhom4.model.Member;
import com.nhom4.model.Product;
import com.nhom4.model.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MemberRepository {
      public List<Member> getAllMember(){
        
        Connection connection  = Connect.connectSQL();
        List<Member> lst = new ArrayList<Member>();
        
        String query = "SELECT * FROM khachhang";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
               
                  Member member = new Member();
                  member.setMakhachhang(rs.getString("makhachhang"));
                  member.setTenkhachhang(rs.getString("tenkhachhang"));
                  member.setLoaikhachhang(rs.getString("loaikhachhang"));
                  member.setTichdiem(rs.getInt("tichdiem"));
                  member.setSodienthoai(rs.getString("sodienthoai"));
                  lst.add(member);
            }
            
        }catch(SQLException e){
            e.getStackTrace();
        }
        return lst;
    }
      ///////////
      public boolean insertMember(Member member){
        
        Connection connection  = Connect.connectSQL();
        String query = "INSERT INTO khachhang(MaKhachHang,TenKhachHang,LoaiKhachHang,TichDiem,SoDienThoai) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, member.getMakhachhang());
            
            preparedStatement.setString(2, member.getTenkhachhang());
            
            preparedStatement.setString(3, member.getLoaikhachhang());
            
         
            preparedStatement.setDouble(4, member.getTichdiem());
            
            preparedStatement.setString(5, member.getSodienthoai());
            
            
            System.out.println(preparedStatement.toString());
            int rs = preparedStatement.executeUpdate();
            
            return true;
        }catch(SQLException e){
           e.getStackTrace();
        }
        return false;
    }
      /////////////////////////////////
       public boolean updateMember(Member member){
        
        Connection connection  = Connect.connectSQL();
        String query = "UPDATE khachhang SET TenKhachHang=?,LoaiKhachHang=?,TichDiem=?,SoDienThoai=? WHERE MaKhachHang=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            
           
            preparedStatement.setString(1, member.getTenkhachhang());
            preparedStatement.setString(2, member.getLoaikhachhang());
            preparedStatement.setDouble(3, member.getTichdiem());
            preparedStatement.setString(4, member.getSodienthoai());
            preparedStatement.setString(5, member.getMakhachhang());
            System.out.print(preparedStatement.toString());
            int rs = preparedStatement.executeUpdate();
            
            return rs != 0;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
        
    } 

    public boolean deleteMember(String memberID){
        Connection connection  = Connect.connectSQL();
        String query = "DELETE  FROM KhachHang WHERE MaKhachHang =?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, memberID);
           
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
        
    }
      
      
}
