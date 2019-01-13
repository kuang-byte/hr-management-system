package com.hao.practice.salarymanagement.controller;

import com.hao.practice.salarymanagement.model.Salary;
import com.hao.practice.salarymanagement.model.Salary.SalaryPK;
import com.hao.practice.salarymanagement.repository.SalaryRepository;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice.Local;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
@Transactional
public class SalaryController {

  @PersistenceContext
  private EntityManager entityManager;

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

  @GetMapping("/salary")
  public Salary getSalaryByEmployeeNumberAndFromDate(
      @RequestParam(value = "empNo") int employeeNumber,
      @RequestParam(value = "fromDate") String fromDate) throws Exception {

    Optional<Salary> salary = salaryRepository
        .findById(new SalaryPK(employeeNumber, LocalDate.parse(fromDate)));

    return salary.get();
  }
}