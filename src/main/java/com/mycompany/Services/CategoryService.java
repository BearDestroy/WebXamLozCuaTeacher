package com.mycompany.Services;

import com.mycompany.Models.Category;
import com.mycompany.Repository.CategoryRepository;
import com.mycompany.Repository.ProductRepository;
import com.mycompany.ServiceConstracts.ICategoryService;
import com.mycompany.ServiceConstracts.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        return this.categoryRepository.findById(id).get();
    }

    @Override
    public Boolean create(Category category) {
        try {
            this.categoryRepository.save(category);
            return null;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean update(Category category) {
        try {
            category.setMaloaihang(category.getMaloaihang());
            category.setTenloaihang(category.getTenloaihang());
            category.setMieuta(category.getMieuta());
            this.categoryRepository.save(category);
            return null;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean delete(Category category) {
        return null;
    }
}
