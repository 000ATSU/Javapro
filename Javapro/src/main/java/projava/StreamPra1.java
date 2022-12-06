package projava;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamPra1 {
  public static void main(String[] args) {
    var fruit = List.of("apple", "banana", "grape");
    var result = new ArrayList<String>();
    var judge = "false";

    for (var s : fruit) {
      if (s.length() == 5) {
        result.add(s);
      }
    }
    for (var t : result) {
      if (t.contains("p")) {
        judge = "ture";
      }
    }
    System.out.println(judge);
  }
}
