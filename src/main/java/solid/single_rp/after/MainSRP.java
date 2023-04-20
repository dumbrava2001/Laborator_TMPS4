package solid.single_rp.after;

import java.time.LocalDateTime;
import solid.WorkLog;

public class MainSRP {

  public static void main(String[] args) {
    WorkLog workLog1 = new WorkLog(LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1500);
    WorkLog workLog2 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(4), 2000);
    WorkLog workLog3 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(5), 1600.40);

    ABaseEmployee employee = new ABaseEmployee("Bob", 1500);
    employee.addWorkLog(workLog1);
    employee.addWorkLog(workLog2);
    employee.addWorkLog(workLog3);

    EmployeeMapper employeeMapper = new EmployeeMapper();
    System.out.println("Json Format");
    System.out.println(employeeMapper.getJsonReport(employee));
    System.out.println("Csv Format");
    System.out.println(employeeMapper.getCsvReport(employee));
  }
}
