/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.model;

/**
 *
 * @author phamquochuy
 */
public class Member {
  
    private String Makhachhang;
    private String Tenkhachhang;
    private String Loaikhachhang;
    private int Tichdiem;
    private String Sodienthoai;

    public Member(String Makhachhang, String Tenkhachhang, String Loaikhachhang, int Tichdiem, String Sodienthoai) {
        this.Makhachhang = Makhachhang;
        this.Tenkhachhang = Tenkhachhang;
        this.Loaikhachhang = Loaikhachhang;
        this.Tichdiem = Tichdiem;
        this.Sodienthoai = Sodienthoai;
    }
    public Member()
    {
        
    }

    public String getMakhachhang() {
        return Makhachhang;
    }

    public void setMakhachhang(String Makhachhang) {
        this.Makhachhang = Makhachhang;
    }

    public String getTenkhachhang() {
        return Tenkhachhang;
    }

    public void setTenkhachhang(String Tenkhachhang) {
        this.Tenkhachhang = Tenkhachhang;
    }

    public String getLoaikhachhang() {
        return Loaikhachhang;
    }

    public void setLoaikhachhang(String Loaikhachhang) {
        this.Loaikhachhang = Loaikhachhang;
    }

    public int getTichdiem() {
        return Tichdiem;
    }

    public void setTichdiem(int Tichdiem) {
        this.Tichdiem = Tichdiem;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }
    
    
}
