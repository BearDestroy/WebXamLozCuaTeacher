package com.mycompany.Models;
import jakarta.persistence.*;

@Entity
@Table(name="loaihang")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="maloaihang")
    private int maloaihang;
    @Column(name="tenloaihang")
    private String tenloaihang;
    @Column(name="mieuta")
    private String mieuta;

    public Category() {
    }

    public Category(int maloaihanghanghoa, String tenloaihang, String mieuta) {
        this.maloaihang = maloaihanghanghoa;
        this.tenloaihang = tenloaihang;
        this.mieuta = mieuta;
    }

    public int getMaloaihang() {
        return maloaihang;
    }

    public void setMaloaihang(int maloaihang) {
        this.maloaihang = maloaihang;
    }

    public String getTenloaihang() {
        return tenloaihang;
    }

    public void setTenloaihang(String tenloaihang) {
        this.tenloaihang = tenloaihang;
    }

    public String getMieuta() {
        return mieuta;
    }

    public void setMieuta(String mieuta) {
        this.mieuta = mieuta;
    }
}

