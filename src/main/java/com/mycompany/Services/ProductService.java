package com.mycompany.Services;

import java.util.List;

import com.mycompany.ServiceConstracts.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.Models.Product;
import com.mycompany.Repository.ProductRepository;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();

    }
    @Override
    public List<Product> findByxuhuong(int xuhuong){
        return this.productRepository.findByxuhuong(xuhuong);
    }
    @Override
    public List<Product> findByphobien(int phobien){
        return this.productRepository.findByphobien(phobien);
    }
    @Override
    public Product getProductById(String id) {
        return this.productRepository.findById(id).get();
    }
    @Override
    public Boolean create(Product product) {
        try {
            this.productRepository.save(product);
            return null;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public Boolean update(Product product) {
        return null;
    }
    @Override
    public Boolean delete(Product product) {
        return null;
    }
}
