package com.hao.practice.salarymanagement.controller;

import com.hao.practice.salarymanagement.model.Salary;
import com.hao.practice.salarymanagement.repository.SalaryRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
@AllArgsConstructor
public class SalaryController {

  private final SalaryRepository salaryRepository;

  @GetMapping("/salaries")
  public List<Salary> getPagedSalaries(@RequestParam(value = "start") int start,
      @RequestParam(value = "limit") int limit) {
    return salaryRepository.findAll(PageRequest.of(start, limit)).getContent();
  }

  @GetMapping("/salaries/{empNo}")
  public List<Salary> getSalariesByEmployeeNumber(@PathVariable(value = "empNo") int empNo) {
    return salaryRepository.findBySalaryPKEmpNo(empNo);
  }

}
