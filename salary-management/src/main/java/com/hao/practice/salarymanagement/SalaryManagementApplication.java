package com.hao.practice.salarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SalaryManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(SalaryManagementApplication.class, args);
  }

}

