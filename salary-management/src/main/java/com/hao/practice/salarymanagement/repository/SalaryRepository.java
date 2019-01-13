package com.hao.practice.salarymanagement.repository;

import com.hao.practice.salarymanagement.model.Salary;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, Salary.SalaryPK> {

  Page<Salary> findAll(Pageable pageable);

  List<Salary> findBySalaryPKEmpNo(int empNo);
}
