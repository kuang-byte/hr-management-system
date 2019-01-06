package com.hao.practice.salarymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

  @GetMapping
  public String getSalary() {
    return "Salary";
  }
}
