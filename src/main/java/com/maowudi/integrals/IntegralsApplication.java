package com.maowudi.integrals;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.maowudi.integrals.*.dao")
public class IntegralsApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegralsApplication.class, args);
    }

}
