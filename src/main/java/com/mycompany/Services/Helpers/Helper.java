package com.mycompany.Services.Helpers;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.UUID;

public class Helper {
    public static String saveFile(MultipartFile file) throws IOException {
        // Tạo tên file unique để tránh trùng lặp
        // Đường dẫn lưu file
        String UPLOAD_DIR = "src/main/resources/static/images/";
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();



        // Lưu file
        Path path = Paths.get(UPLOAD_DIR + fileName);
        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

        return fileName;
    }
}
