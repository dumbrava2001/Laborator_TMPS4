package solid;

import java.time.LocalDateTime;

public record WorkLog(LocalDateTime startDate, LocalDateTime endDate, double sum) {

  @Override
  public String toString() {
    return "{" +
        "\"startDate\":" + startDate +
        ",\"endDate\":" + endDate +
        ",\"sum\"" + sum +
        '}';
  }
}
