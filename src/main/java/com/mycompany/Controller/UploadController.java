//package com.mycompany.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.multipart.MultipartFile;
//import webstore3.webstore3.Model.Images;
//import webstore3.webstore3.Respository.IImageRepository;
//import webstore3.webstore3.Service.Helpers.Helper;
//
//import java.io.IOException;
//
//@Controller
//public class UploadController {
//    @Autowired
//    private IImageRepository _imageRepository;
//    @GetMapping("/upload")
//    public String index(Model model){
//        model.addAttribute("list", _imageRepository.findAll());
//        return "upload/index";
//    }
//    @GetMapping("/upload/add")
//    public String add(){
//        return "upload/add";
//    }
//    @PostMapping("/upload/add")
//    public String add(MultipartFile f){
//        try {String fileName = Helper.saveFile("images", f, 32);
//            Images image = new Images(0, fileName, f.getSize(), f.getContentType());
//            _imageRepository.save(image);
//            return "redirect:/upload";
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "upload/add";
//    }
//}
