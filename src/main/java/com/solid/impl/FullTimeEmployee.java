package com.solid.impl;

import com.solid.interfaces.Employee;
public class FullTimeEmployee implements Employee {
  private String name;
  private String department;

  public FullTimeEmployee(String name, String department) {
    this.name = name;
    this.department = department;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDepartment() {
    return department;
  }
}
