package com.sundry.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.sundry.repository"})
@EntityScan(basePackages = {"com.sundry.domain"
                ,"com.sundry.service"
                ,"com.sundry.controller"})
@ComponentScan(basePackages = {"com.sundry.repository"
                ,"com.sundry.domain"
                ,"com.sundry.service"
                , "com.sundry.controller"
                , "com.sundry.serviceImpl"})
@EnableAutoConfiguration
@Configuration
public class SundryCash {
    public static void main(String[] args) {
        SpringApplication.run(SundryCash.class);
    }
}
