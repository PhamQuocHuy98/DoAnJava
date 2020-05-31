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
    private String ma;
    private String ten;
    private double gia;
    private String hinhanh;
    private String maLoaiSanPham;
    
    Product(){
        
    }
    
    Product(String ma,String ten,double gia,String hinhanh,String maLoaiSanPham){
        this.ma=ma;
        this.ten=ten;
        this.gia=gia;
        this.hinhanh=hinhanh;
        this.maLoaiSanPham=maLoaiSanPham;
    }
}
