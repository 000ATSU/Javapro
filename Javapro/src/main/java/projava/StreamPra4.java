package projava;


import java.util.List;

public class StreamPra4 {
  public static void main(String[] args) {
    var strs = List.of("apple", "banana", "orange", "paineapple");

    var result = strs.stream().allMatch(s -> s.contains("a"));
    System.out.println(result);
  }
}
