package com.snow.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author snow
 * @qq 83845715
 */
@SpringBootApplication
@MapperScan("com.snow.manager.mapper")
@EnableTransactionManagement
public class SnowManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SnowManagerApplication.class, args);
    }

}
