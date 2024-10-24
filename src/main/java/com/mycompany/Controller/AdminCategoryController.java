package com.mycompany.Controller;

import com.mycompany.Models.Category;
import com.mycompany.Models.Product;
import com.mycompany.Services.CategoryService;
import com.mycompany.Services.Helpers.Helper;
import com.mycompany.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminCategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/category")
    public String adminproduct(Model model) {
        List<Category> lstPro=this.categoryService.getAll();
        model.addAttribute("listPro",lstPro);
        return "Admin/category/category";
    }
    @GetMapping("/category-add")
    public String admin_product_add(Model model) {
        model.addAttribute("category", new Category());
        return "Admin/category/add-category";
    }
    @PostMapping("/category-add")
    public String save(@ModelAttribute Category category) {
        categoryService.create(category);
           return "redirect:/home";
    }
}
