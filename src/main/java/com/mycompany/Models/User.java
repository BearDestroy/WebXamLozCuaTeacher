package com.mycompany.Models;
import jakarta.persistence.*;
@Entity
@Table(name="taikhoan")
public class User {
    @Id
    @Column(name="email")
    private String email;
    @Column(name="matkhau")
    private String matkhau;

    public User() {
    }

    public User(String email, String matkhau) {
        this.email = email;
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}
