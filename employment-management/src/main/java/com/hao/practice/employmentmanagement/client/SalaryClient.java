package com.hao.practice.employmentmanagement.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "salary-management")
public interface SalaryClient {

  @GetMapping("/")
  String getSalary();
}
