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
    
    //public 
}
