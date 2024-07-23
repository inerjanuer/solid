# Solid


### Integrantes 

- Inerjanuer Bernate Fonseca
- Hector Fabio Bedoya Loaiza
- Ivan Dario Viasus Quintero
- Gabriel Santiago Agudelo Ramirez

### Identificacion de principios violados

1. Se modifica la clase ReportGenerator principio de single responsabality creando dos clases una de 
excelReportGenerator, PDFReportGenerator.
2. Se crea interface para ReporteOperation principio de abierto o cerrado.
3. Se crea una interface para obtener el nombre del empleado por tiempo ley de liskov.
4. Se divide la interface de EmployeeOperations por  ley de interface segregation, creando interface adicional 
para el proceso de calculateSalary y saveToFile 
5. La clase SalaryCaculator depende directamente de la implementación EmployManager. Debería depender de una abstracción en lugar de una clase directa.
6. 
  