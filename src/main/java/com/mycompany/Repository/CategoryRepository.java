package com.mycompany.Repository;

import com.mycompany.Models.Category;
import com.mycompany.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
