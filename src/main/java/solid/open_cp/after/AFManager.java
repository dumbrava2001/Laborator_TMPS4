package solid.open_cp.after;

import java.util.ArrayList;
import java.util.List;
import solid.WorkLog;

public class AFManager implements Employee {

  private final String name;

  private final double salary;

  private final List<WorkLog> workLogsList = new ArrayList<>();

  private final List<AFBaseEmployee> managedEmployees = new ArrayList<>();


  public AFManager(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void addWorkLog(WorkLog workLog) {
    workLogsList.add(workLog);
  }

  public void removeWorkLog(WorkLog workLog) {
    workLogsList.remove(workLog);
  }

  public List<AFBaseEmployee> getManagedEmployees() {
    return managedEmployees;
  }

  public void addManagedEmployee(AFBaseEmployee employee) {
    managedEmployees.add(employee);
  }

  public void removeManagedEmployee(AFBaseEmployee employee) {
    managedEmployees.remove(employee);
  }

  public double getTotalWorkLogSum() {
    return workLogsList.stream()
        .mapToDouble(WorkLog::sum)
        .sum();
  }


  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getSalary() {
    return salary;
  }

  @Override
  public List<WorkLog> getWorkLogs() {
    return workLogsList;
  }

  @Override
  public double getBonus() {
    double bonusSum = salary * 3;
    double reward = 0;
    if (getTotalWorkLogSum() > bonusSum) {
      reward += salary * 0.35;
    }

    if (getManagedEmployeeTotalWorkSum() > bonusSum * 2) {
      reward += salary * 0.15;
    }

    return reward;
  }

  public double getManagedEmployeeTotalWorkSum() {
    return managedEmployees.stream()
        .mapToDouble(AFBaseEmployee::getTotalWorkLogSum)
        .sum();
  }
}
