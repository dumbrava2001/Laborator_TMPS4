package solid.open_cp.before;

import java.util.List;

public class BFSalaryCalculator {

  public String getEmployeesSalaryReport(List<Object> employees){
    StringBuilder stringBuilder = new StringBuilder();

    for (Object employee : employees) {
      if (employee instanceof BFBaseEmployee) {
        double salary = ((BFBaseEmployee) employee).getSalary();
        double totalWorkLogSum = ((BFBaseEmployee) employee).getTotalWorkLogSum();
        double bonusSum = salary * 2;
        double reward = 0;
        if (totalWorkLogSum > bonusSum) {
          reward = salary * 0.3;
        }
        stringBuilder.append(((BFBaseEmployee) employee).getName())
            .append(",").append(salary).append(",").append(reward).append(",")
            .append(salary + reward).append("\n");
      }else if (employee instanceof BFManager){
        double salary = ((BFManager) employee).getSalary();
        double totalWorkLogSum = ((BFManager) employee).getTotalWorkLogSum();
        double managedEmployeeSum = ((BFManager) employee).getManagedEmployeeTotalWorkSum();
        double bonusSum = salary * 3;
        double reward = 0;
        if (totalWorkLogSum > bonusSum){
          reward += salary * 0.35;
        }

        if (managedEmployeeSum > bonusSum * 2){
          reward += salary * 0.15;
        }
        stringBuilder.append(((BFManager) employee).getName())
            .append(",").append(salary).append(",").append(reward).append(",")
            .append(salary + reward).append("\n");
      }
    }
    return stringBuilder.toString();
  }

}
