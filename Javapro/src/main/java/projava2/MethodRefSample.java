package projava2;

import java.util.List;
import java.util.stream.IntStream;

public class MethodRefSample {
  public static void main(String[] args) {
    var names = List.of("yamamoto", "kis", "sugiyama");
    int x = "abc".length();

//    IntStream.range(0, 3)
//            .map(MethodRefSample::twice)
//            .forEach(System.out::println);

//    System.out.println(names.stream().map(String::toUpperCase).toList());
//    System.out.println(names.stream().map("%sさん"::formatted).toList());
//    System.out.println(names.stream().map(s -> s.toLowerCase()).toList());

    System.out.println(" three times".repeat(x));
  }

  private static int twice(int x) {
    return x * 2;
  }

}
//  IntStream.of(nums).mapToObj(n -> "*".repeat(n)).toList();
//  ↑メソッド参照に変換
//  IntStream.of(nums).mapToObj(Int::"*".repeat).toList();
//
//
//
//
//
//
