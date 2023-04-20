package solid.open_cp.after;

import java.util.List;

public class AFSalaryCalculator {

  public String getEmployeesSalaryReport(List<Employee> employees) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Employee employee : employees) {
      stringBuilder.append(employee.getName()).append(",").append(employee.getSalary()).append(",")
          .append(employee.getBonus()).append(",")
          .append(employee.getSalary() + employee.getBonus()).append("\n");
    }
    return stringBuilder.toString();
  }
}
