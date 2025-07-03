package com.refsys.adminweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.refsys.adminweb.repository")
public class AdminwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminwebApplication.class, args);
    }

}
