package com.inebao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * create time: 2018/7/4
 *
 * @author iteaj
 * @since 1.0
 */
@SpringBootApplication(scanBasePackages = "com.inebao.*.config")
public class FaceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceBootApplication.class, args);
    }
}
