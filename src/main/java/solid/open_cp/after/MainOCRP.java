package solid.open_cp.after;

import java.time.LocalDateTime;
import java.util.List;
import solid.WorkLog;

public class MainOCRP {

  public static void main(String[] args) {
    WorkLog workLog1 = new WorkLog(LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1500);
    WorkLog workLog2 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(4), 2000);
    WorkLog workLog3 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(5), 9600.40);

    AFBaseEmployee baseEmployee = new AFBaseEmployee("Bob", 1500);
    baseEmployee.addWorkLog(workLog1);
    baseEmployee.addWorkLog(workLog2);
    baseEmployee.addWorkLog(workLog3);

    AFManager manager = new AFManager("Chris", 2500);
    manager.addWorkLog(workLog3);
    manager.addManagedEmployee(baseEmployee);

    AFSalaryCalculator salaryCalculator = new AFSalaryCalculator();
    System.out.println(salaryCalculator.getEmployeesSalaryReport(List.of(manager, baseEmployee)));
  }
}
