package solid.open_cp.before;

import java.util.ArrayList;
import java.util.List;
import solid.WorkLog;

public class BFManager {
  private final String name;

  private final double salary;

  private final List<WorkLog> workLogsList = new ArrayList<>();

  private final List<BFBaseEmployee> managedEmployees = new ArrayList<>();

  public BFManager(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public List<WorkLog> getWorkLogsList() {
    return workLogsList;
  }

  public void addWorkLog(WorkLog workLog) {
    workLogsList.add(workLog);
  }

  public void removeWorkLog(WorkLog workLog) {
    workLogsList.remove(workLog);
  }

  public List<BFBaseEmployee> getManagedEmployees() {
    return managedEmployees;
  }

  public void addManagedEmployee(BFBaseEmployee employee){
    managedEmployees.add(employee);
  }

  public void removeManagedEmployee(BFBaseEmployee employee) {
    managedEmployees.remove(employee);
  }

  public double getTotalWorkLogSum(){
    return workLogsList.stream()
        .mapToDouble(WorkLog::sum)
        .sum();
  }

  public double getBonus(){
    double bonusSum = salary * 3;
    double reward = 0;
    if (getTotalWorkLogSum() > bonusSum){
      reward += salary * 0.35;
    }

    if (getManagedEmployeeTotalWorkSum() > bonusSum * 2){
      reward += salary * 0.15;
    }

    return reward;
  }

  public double getManagedEmployeeTotalWorkSum(){
    return managedEmployees.stream()
        .mapToDouble(BFBaseEmployee::getTotalWorkLogSum)
        .sum();
  }
}
