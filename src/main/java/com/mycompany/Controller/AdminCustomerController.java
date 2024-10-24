package com.mycompany.Controller;

import com.mycompany.Models.Category;
import com.mycompany.Models.Customer;
import com.mycompany.Models.Product;
import com.mycompany.Services.CategoryService;
import com.mycompany.Services.CustomerService;
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
public class AdminCustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/customer")
    public String adminproduct(Model model) {
        List<Customer> lstPro=this.customerService.getAll();
        model.addAttribute("listPro",lstPro);
        return "Admin/customer/customer";
    }
    @GetMapping("/customer-add")
    public String admin_product_add(Model model) {
        model.addAttribute("customer", new Customer());
        return "Admin/customer/add-customer";
    }
    @PostMapping("/customer-add")
    public String save(@ModelAttribute Customer product) {
            customerService.create(product);
           return "redirect:/home";
    }
}
