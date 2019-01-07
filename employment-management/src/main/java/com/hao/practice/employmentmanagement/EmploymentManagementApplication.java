package com.hao.practice.employmentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EmploymentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentManagementApplication.class, args);
	}

}

