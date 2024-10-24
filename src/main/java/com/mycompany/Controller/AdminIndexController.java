package com.mycompany.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminIndexController {
    @GetMapping("/home")
    public String adminIndex() {
        return "/admin/index";
    }
}
