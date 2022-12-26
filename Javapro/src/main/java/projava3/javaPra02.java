package projava3;

import java.util.Scanner;

public class javaPra02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("アルファベットもしくは1か0を入力してください");
    String data = scanner.next();

    final int BASE_COUNTER = 1;
    int i = BASE_COUNTER;
    var builder = new StringBuilder();
    for (var ch : data.toCharArray()) {
      if (ch == '0') {
        i = 0;
        continue;
      } else if (ch == '1') {
        i = BASE_COUNTER;
        continue;
      }
      if (i == 0) {
        builder.append(String.valueOf(ch).toUpperCase());
      }else if (i == 1) {
        builder.append(String.valueOf(ch).toLowerCase());
      }
    }
    var result = builder.toString();
    System.out.println(result);
  }
}

