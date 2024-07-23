package com.solid.impl;

import com.solid.interfaces.ReportOperation;

public class PDFReportGenerator implements ReportOperation  {

  public void generateReport() {
    // Generar reporte
    System.out.println("Generando reporte en pdf");
  }

}
