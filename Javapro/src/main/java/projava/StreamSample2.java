package projava;

import java.util.List;

public class StreamSample2 {
  public static void main(String[] args) {
    var data = List.of("yamamoto", "kis", "sugiyama");
    var resutl = 0;

    for (var s : data) {
      if (s.length() >= 5) {
        resutl++;
      }
    }
    System.out.println(resutl);
  }
}
