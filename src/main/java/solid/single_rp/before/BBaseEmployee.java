package solid.single_rp.before;

import java.util.ArrayList;
import java.util.List;
import solid.WorkLog;

public class BBaseEmployee {

  private final String name;

  private final double salary;

  private final List<WorkLog> workLogsList = new ArrayList<>();

  public BBaseEmployee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void addWorkLog(WorkLog workLog) {
    workLogsList.add(workLog);
  }

  public void removeWorkLog(WorkLog workLog) {
    workLogsList.remove(workLog);
  }

  public double getTotalWorkLogSum() {
    return workLogsList.stream()
        .mapToDouble(WorkLog::sum)
        .sum();
  }

  public String getJsonReport() {
    return "{\"name\":" + name
        + ",\"salary\":" + salary
        + ",\"workLogs\":" + workLogsList
        + ",\"workLogSum\":" + getTotalWorkLogSum()
        + "}";
  }

  public String getCsvReport() {
    return name
        + ","
        + salary
        + ","
        + workLogsList
        + ","
        + getTotalWorkLogSum();
  }
}
