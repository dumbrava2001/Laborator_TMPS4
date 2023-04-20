package solid.open_cp.after;

import java.util.ArrayList;
import java.util.List;
import solid.WorkLog;

public class AFBaseEmployee implements Employee {

  private final String name;

  private final double salary;

  private final List<WorkLog> workLogsList = new ArrayList<>();

  public AFBaseEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void addWorkLog(WorkLog workLog) {
    workLogsList.add(workLog);
  }

  public void removeWorkLog(WorkLog workLog) {
    workLogsList.remove(workLog);
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

  public double getTotalWorkLogSum() {
    return workLogsList.stream()
        .mapToDouble(WorkLog::sum)
        .sum();
  }

  @Override
  public double getBonus() {
    double bonusSum = salary * 2;
    if (getTotalWorkLogSum() > bonusSum) {
      return salary * 0.3;
    }
    return 0;
  }
}
