package solid.single_rp.after;

import java.util.ArrayList;
import java.util.List;
import solid.WorkLog;

public class ABaseEmployee {
  private final String name;

  private final double salary;

  private final List<WorkLog> workLogsList = new ArrayList<>();

  public ABaseEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void addWorkLog(WorkLog workLog) {
    workLogsList.add(workLog);
  }

  public void removeWorkLog(WorkLog workLog) {
    workLogsList.remove(workLog);
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

  public double getTotalWorkLogSum() {
    return workLogsList.stream()
        .mapToDouble(WorkLog::sum)
        .sum();
  }

}
