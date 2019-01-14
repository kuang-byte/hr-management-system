package com.hao.practice.departmentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentManagementController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }
}
