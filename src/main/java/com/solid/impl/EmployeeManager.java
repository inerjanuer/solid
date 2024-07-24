package com.solid.impl;

import com.solid.interfaces.Employee;
import com.solid.interfaces.EmployeeOperatios;

public class EmployeeManager implements EmployeeOperatios {

  @Override
  public void addEmployee(Employee employee) {
    System.out.println("Se agrega el empleado: "+ employee.getName());
  }

  @Override
  public void removeEmployee(Employee employee) {
    System.out.println("Se elimina el empleado: " + employee.getName());
  }
}
