package com.mycompany.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="hanghoa")
public class Product {
    @Id
    @Column(name="mahh")
    private String mahh;
    @Column(name="tenhh")
    private String tenhh;
    @Column(name="dongia")
    private int dongia;
    @Column(name="xuatxu")
    private String xuatxu;
    @Column(name="loaihh")
    private int loaihh;
    @Column(name="hinh")
    private String hinh;
    @Column(name="xuhuong")
    private int xuhuong;
    @Column(name="phobien")
    private int phobien;
    public Product() {
    }
    public Product(String mahh, String tenhh, int dongia, String xuatxu, int loaihh,
                   String hinh, int xuhuong,
                   int phobien) {
        super();
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.dongia = dongia;
        this.xuatxu = xuatxu;
        this.loaihh = loaihh;
        this.hinh = hinh;
        this.xuhuong = xuhuong;
        this.phobien = phobien;
    }
    public String getMahh() {
        return mahh;
    }
    public void setMahh(String mahh) {
        this.mahh = mahh;
    }
    public String getTenhh() {
        return tenhh;
    }
    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }
    public int getDongia() {
        return dongia;
    }
    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    public String getXuatxu() {
        return xuatxu;
    }
    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
    public int getLoaihh() {
        return loaihh;
    }
    public void setLoaihh(int loaihh) {
        this.loaihh = loaihh;
    }
    public String getHinh() {
        return hinh;
    }
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public int getXuhuong() {
        return xuhuong;
    }
    public void setXuhuong(int xuhuong) {
        this.xuhuong = xuhuong;
    }
    public int getPhobien() {
        return phobien;
    }
    public void setPhobien(int phobien) {
        this.phobien = phobien;
    }
}
