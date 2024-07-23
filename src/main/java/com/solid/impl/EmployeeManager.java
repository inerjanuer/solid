package com.solid.impl;

import com.solid.interfaces.EmployeeOperatios;

public class EmployeeManager implements EmployeeOperatios {

  @Override
  public void addEmployee(String name) {
    System.out.println("Se agrega el empleado: "+name);
  }

  @Override
  public void removeEmployee(String name) {
    System.out.println("Se elimina el empleado: "+name);
  }
}
