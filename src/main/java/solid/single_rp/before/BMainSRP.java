package solid.single_rp.before;

import java.time.LocalDateTime;
import solid.WorkLog;

public class BMainSRP {

  public static void main(String[] args) {
    WorkLog workLog1 = new WorkLog(LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1500);
    WorkLog workLog2 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(4), 2000);
    WorkLog workLog3 = new WorkLog(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(5), 1600.40);

    BBaseEmployee bBaseEmployee = new BBaseEmployee("Bob", 1500);
    bBaseEmployee.addWorkLog(workLog1);
    bBaseEmployee.addWorkLog(workLog2);
    bBaseEmployee.addWorkLog(workLog3);

    System.out.println(bBaseEmployee.getJsonReport());
    System.out.println(bBaseEmployee.getCsvReport());
  }
}
