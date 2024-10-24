package com.mycompany.Repository;

import java.util.List;

import com.mycompany.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,String>{
    List<Product> findByxuhuong(int xuhuong);
    List<Product> findByphobien(int phobien);
}
