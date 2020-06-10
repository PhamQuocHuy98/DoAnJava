/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import com.nhom4.model.Staff;
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
public class StaffRepository {
    
    public List<Staff> getListStaff(){
         Connection connection  = Connect.connectSQL();
         List<Staff> lst = new ArrayList<>();
         
         String query = "SELECT * FROM NhanVien";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            
            while(rs.next()){
                
               
                Staff staff = new Staff();
                
                
                staff.setMaNV(rs.getString("manhanvien"));
                staff.setTenNV(rs.getString("tennhanvien"));
                staff.setGioiTinh(rs.getInt("gioitinh"));
                
                staff.setChucVu(rs.getString("chucvu"));
                staff.setNgayVaoLam(rs.getString("ngayvaolam"));
                staff.setDiaChi(rs.getString("diachi"));
                staff.setSdt(rs.getString("sdt"));
                staff.setPhanQuyen(rs.getInt("phanquyen"));
                staff.setLuong(rs.getDouble("luong"));
                lst.add(staff);
            }
            
        }catch(SQLException e){
            e.getStackTrace();
        }
         
         return lst;
    }
    
    public boolean insertStaff(Staff staff){
        
        Connection connection  = Connect.connectSQL();
        String query = "INSERT INTO NhanVien (MaNhanVien, TenNhanVien, GioiTinh, ChucVu, DiaChi, SDT, PhanQuyen, MatKhau, Luong) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, staff.getMaNV());
            
            preparedStatement.setString(2, staff.getTenNV());
            
            preparedStatement.setInt(3, staff.getGioiTinh());
            
            preparedStatement.setString(4, staff.getChucVu());
            
            preparedStatement.setString(5, staff.getDiaChi());
            
            preparedStatement.setString(6, staff.getSdt());
            
            preparedStatement.setInt(7, staff.getPhanQuyen());
            
            preparedStatement.setString(8, staff.getMatKhau());
            
            preparedStatement.setDouble(9, staff.getLuong());
            
            int rs = preparedStatement.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
           e.getStackTrace();
           return false;
        }
        
    } 
}
