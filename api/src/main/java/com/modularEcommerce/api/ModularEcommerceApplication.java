package com.modularEcommerce.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.modularEcommerce") // 서비스, 컨트롤러 스캔
@EnableJpaRepositories(basePackages = "com.modularEcommerce") // 레포지토리 스캔
@EntityScan(basePackages = "com.modularEcommerce") // @Entity 위치 지정
public class ModularEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModularEcommerceApplication.class, args);
    }

}
