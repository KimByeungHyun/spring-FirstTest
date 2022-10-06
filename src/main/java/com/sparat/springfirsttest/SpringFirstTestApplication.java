package com.sparat.springfirsttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringFirstTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFirstTestApplication.class, args);
    }

}
