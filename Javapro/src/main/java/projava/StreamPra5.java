package projava;

import java.util.List;

public class StreamPra5 {
  public static void main(String[] args) {
    var strs = List.of("apple", "banana", "orange", "paineapple");

    var result = strs.stream().anyMatch(s -> s.contains("c"));
    System.out.println(result);
  }
}
