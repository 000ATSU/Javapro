package projava;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamPra3 {
  public static void main(String[] args) {
    var strs = List.of("apple", "banana", "orange", "pineapple");

    var result = strs.stream().filter(a -> a.length() >= 6).collect(Collectors.joining()).length();
    System.out.println(result);
  }
}
