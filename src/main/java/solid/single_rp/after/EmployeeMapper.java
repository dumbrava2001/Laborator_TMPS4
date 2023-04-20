package solid.single_rp.after;

public class EmployeeMapper {



  public String getJsonReport(ABaseEmployee employee) {
    return "{\"name\":" + employee.getName()
        + ",\"salary\":" + employee.getSalary()
        + ",\"workLogs\":" + employee.getWorkLogsList()
        + ",\"workLogSum\":" + employee.getTotalWorkLogSum()
        + "}";
  }

  public String getCsvReport(ABaseEmployee employee) {
    return employee.getName()
        + ","
        + employee.getSalary()
        + ","
        + employee.getWorkLogsList()
        + ","
        + employee.getTotalWorkLogSum();
  }
}
