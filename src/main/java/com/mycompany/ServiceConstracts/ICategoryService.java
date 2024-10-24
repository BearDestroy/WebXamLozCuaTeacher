package com.mycompany.ServiceConstracts;

import com.mycompany.Models.Category;
import com.mycompany.Models.Product;

import java.util.List;

public interface ICategoryService {
    List<Category> getAll();
    Category getCategoryById(int id);
    Boolean create(Category category);
    Boolean update(Category category);
    Boolean delete(Category category);
}
