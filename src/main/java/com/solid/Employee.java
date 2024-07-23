package com.solid;

public class Employee {

  private String name;
  private String departament;

  public Employee(String name, String departament) {
    this.name = name;
    this.departament = departament;
  }

  public String getName() {
    return name;
  }

  public String getDepartament() {
    return departament;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }
}
