package projava;

import java.util.List;
import java.util.ArrayList;

public class StreamPra2 {
  public static void main(String[] args) {
    var fruits = List.of("apple", "banana", "grape");
    var result = 0;

    for (var s : fruits) {
      if (s.length() == 5 && s.contains("p")) {
        result++;
      }
    }
    if (result > 0) {
      System.out.println("ture");
    } else {
      System.out.println("faulse");
    }
  }
}
