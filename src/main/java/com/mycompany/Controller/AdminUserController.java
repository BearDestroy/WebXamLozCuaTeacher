package com.mycompany.Controller;

import com.mycompany.Models.Category;
import com.mycompany.Models.Product;
import com.mycompany.Models.User;
import com.mycompany.Services.CategoryService;
import com.mycompany.Services.Helpers.Helper;
import com.mycompany.Services.ProductService;
import com.mycompany.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminUserController {
    @Autowired
    private UserService userService;


    @GetMapping("/User")
    public String adminproduct(Model model) {
        List<User> lstPro=this.userService.getAll();
        model.addAttribute("listPro",lstPro);
        return "Admin/User/User";
    }
    @GetMapping("/User-add")
    public String admin_product_add(Model model) {
        model.addAttribute("user", new User());
        return "Admin/User/add-User";
    }
    @PostMapping("/User-add")
    public String save(@ModelAttribute User user) {
           userService.create(user);
           return "redirect:/home";
    }
}
