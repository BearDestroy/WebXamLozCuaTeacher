package com.mycompany;

import com.mycompany.Services.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class WebHandmadeLeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebHandmadeLeatherApplication.class, args);
    }

}
