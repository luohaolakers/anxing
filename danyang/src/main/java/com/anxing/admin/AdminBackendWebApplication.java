package com.anxing.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication()
@EnableFeignClients()
@Configuration
public class AdminBackendWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminBackendWebApplication.class, args);
    }

}
