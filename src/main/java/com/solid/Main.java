package com.solid;

import com.solid.impl.EmployeeManager;
import com.solid.impl.ExcelReportGenerator;
import com.solid.impl.FileImpl;
import com.solid.impl.PDFReportGenerator;
import com.solid.impl.PartTimeEmployee;
import com.solid.impl.SalaryCalculator;
import com.solid.interfaces.EmployeeOperatios;
import com.solid.interfaces.FileOperation;
import com.solid.interfaces.PartTimeOperation;
import com.solid.interfaces.ReportOperation;
import com.solid.interfaces.SalaryOperation;

public class Main {

  public static void main(String[] args) {


    ReportOperation report = new PDFReportGenerator();
    ReportOperation reportExcel = new ExcelReportGenerator();
    report.generateReport();
    reportExcel.generateReport();

    PartTimeOperation partTimeOperation = new PartTimeEmployee();
    String name = partTimeOperation.getName();
    System.out.println("El empleado por tiempos es: "+name);

    SalaryOperation salaryOperation = new SalaryCalculator();
    double value = salaryOperation.calculateSalary(new Employee("Pedro", "Cundinamarca"));
    System.out.println("Valor: "+ value);

    FileOperation fileOperation = new FileImpl();
    fileOperation.saveToFile("juan");

    EmployeeOperatios operatios = new EmployeeManager();
    operatios.addEmployee("Felipe");
    operatios.removeEmployee("Juan Carlos");


  }


}
