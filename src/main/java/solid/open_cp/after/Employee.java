package solid.open_cp.after;

import java.util.List;
import solid.WorkLog;

public interface Employee {

  String getName();
  double getSalary();

  List<WorkLog> getWorkLogs();

  double getBonus();
}
