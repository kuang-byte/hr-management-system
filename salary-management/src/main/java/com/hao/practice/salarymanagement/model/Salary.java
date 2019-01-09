package com.hao.practice.salarymanagement.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "salaries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary implements Serializable {

  @EmbeddedId
  private SalaryPK salaryPK;
  @Column(nullable = false)
  private int salary;
  @Column(name = "to_date", nullable = false)
  private LocalDate toDate;

  @Embeddable
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class SalaryPK implements Serializable {

    @Column(name = "emp_no", nullable = false)
    private int empNo;
    @Column(name = "from_date", nullable = false)
    private LocalDate fromDate;
  }

}
