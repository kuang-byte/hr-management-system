package com.hao.practice.departmentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentManagementApplication.class, args);
	}

}

