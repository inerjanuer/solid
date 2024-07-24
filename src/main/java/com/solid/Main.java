package com.solid;

import com.solid.impl.*;
import com.solid.interfaces.Employee;
import com.solid.interfaces.EmployeeOperatios;
import com.solid.interfaces.FileOperation;
import com.solid.interfaces.ReportOperation;

public class Main {

  public static void main(String[] args) {


    ReportOperation report = new PDFReportGenerator();
    ReportOperation reportExcel = new ExcelReportGenerator();
    report.generateReport();
    reportExcel.generateReport();

    Employee partTimeEmployee = new PartTimeEmployee("Hugo", "Aseo");
    String partTimeEmployeeName = partTimeEmployee.getName();
    System.out.println("El empleado por tiempo parcial es: "+partTimeEmployeeName);

    Employee fullTimeEmployee = new FullTimeEmployee("Paco", "Vice");
    String fullTimeEmployeeName = fullTimeEmployee.getName();
    System.out.println("El empleado por tiempo parcial es: "+fullTimeEmployeeName);

    SalaryCalculator salaryOperation = new SalaryCalculator();
    double value = salaryOperation.calculateSalary(fullTimeEmployee);
    System.out.println("Valor: "+ value);

    FileOperation fileOperation = new FileImpl();
    fileOperation.saveToFile("juan");

    EmployeeOperatios operatios = new EmployeeManager();
    operatios.addEmployee(partTimeEmployee);
    operatios.removeEmployee(fullTimeEmployee);


  }


}
