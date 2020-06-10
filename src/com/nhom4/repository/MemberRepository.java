/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.repository;

import com.nhom4.database.Connect;
import com.nhom4.model.Member;
import com.nhom4.model.Member;
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
}
