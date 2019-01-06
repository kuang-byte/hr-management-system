package com.hao.practice.employmentmanagement.controller;

import com.hao.practice.employmentmanagement.client.SalaryClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmploymentController {

  private final SalaryClient salaryClient;

  @GetMapping("/")
  public String getEmploymentSalary() {
    return salaryClient.getSalary();
  }
}
