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
public class Product {

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(String maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }
    private String ma;
    private String ten;
    private double gia;
    private String hinhanh;
    private String maLoaiSanPham;
    
    public Product(){
        
    }
    
    Product(String ma,String ten,double gia,String hinhanh,String maLoaiSanPham){
        this.ma=ma;
        this.ten=ten;
        this.gia=gia;
        this.hinhanh=hinhanh;
        this.maLoaiSanPham=maLoaiSanPham;
    }

    

    
}
