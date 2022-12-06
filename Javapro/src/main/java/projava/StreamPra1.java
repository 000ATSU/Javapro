package projava;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamPra1 {
  public static void main(String[] args) {
    var fruit = List.of("apple", "banana", "grape");
    var result = new ArrayList<String>();

    for (var s : fruit) {
      if (s.length() == 5) {
        result.add(s);
      }
    }
    System.out.println(result);
    if (Arrays.asList(result).contains("p")) {
      System.out.println("true");
    } else {
      System.out.println("faulse");
    }
  }
}
