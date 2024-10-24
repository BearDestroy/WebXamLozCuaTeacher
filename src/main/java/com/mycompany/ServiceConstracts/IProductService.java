package com.mycompany.ServiceConstracts;

import java.util.List;
import com.mycompany.Models.*;
public interface IProductService {
    List<Product> getAll();
    List<Product> findByxuhuong(int xuhuong);
    List<Product> findByphobien(int phobien);
    Product getProductById(String id);
    Boolean create(Product product);
    Boolean update(Product product);
    Boolean delete(Product product);
}
