package com.hao.practice.employmentmanagement.model;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  private int empNo;
  private Date birthDate;
  private String firstName;
  private String lastName;
  private Gender gender;
  private Date hireDate;

  private enum Gender {
    M, F
  }
}
