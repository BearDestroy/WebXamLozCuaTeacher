package com.mycompany.Controller;

import java.io.IOException;
import java.util.List;

import com.mycompany.Repository.CategoryRepository;
import com.mycompany.Repository.ProductRepository;
import com.mycompany.Services.CategoryService;
import com.mycompany.Services.Helpers.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.mycompany.Models.*;
//import com.mycompany.services.Helper;
import com.mycompany.Services.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/product")
    public String adminproduct(Model model) {
        List<Product> lstPro=this.productService.getAll();
        model.addAttribute("listPro",lstPro);
        return "Admin/product/product";
    }
    @GetMapping("/product-add")
    public String admin_product_add(Model model) {
        List<Category> listCategory= categoryService.getAll();
        model.addAttribute("listCategory",listCategory);
        model.addAttribute("product", new Product());
        return "Admin/product/add-product";
    }
    @PostMapping("/product-add")
    public String save(@ModelAttribute Product product,@RequestParam MultipartFile f) {

        try {String fileName = Helper.saveFile(f);
            product.setHinh(fileName);
           productService.create(product);
           return "redirect:/home";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
