package com.smartflow.sprinbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.smartflow.sprinbootmybatis.mappper")
@SpringBootApplication
public class SprinbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinbootMybatisApplication.class, args);
    }

}
