package com.snow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.snow.mapper")
@EnableTransactionManagement
public class SnowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnowApplication.class, args);
    }

}
