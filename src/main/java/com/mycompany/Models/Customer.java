package com.mycompany.Models;
import jakarta.persistence.*;
@Entity
@Table(name="khachhang")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="makh")
    private int makh;
    @Column(name="tenkh")
    private String tenkh;
    @Column(name="dienthoaikh")
    private String dienthoaikh;
    @Column(name="loaikh")
    private String loaikh;

    public Customer() {
    }

    public Customer(int makh, String loaikh, String dienthoaikh, String tenkh) {
        this.makh = makh;
        this.loaikh = loaikh;
        this.dienthoaikh = dienthoaikh;
        this.tenkh = tenkh;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDienthoaikh() {
        return dienthoaikh;
    }

    public void setDienthoaikh(String dienthoaikh) {
        this.dienthoaikh = dienthoaikh;
    }

    public String getLoaikh() {
        return loaikh;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }
}
