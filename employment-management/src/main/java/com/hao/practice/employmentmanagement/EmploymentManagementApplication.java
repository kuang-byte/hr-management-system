package com.hao.practice.employmentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmploymentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentManagementApplication.class, args);
	}

}

