package projava3;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaPra01 {
  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(8,59,40,3,3,0));
    ArrayList<Integer> num2 = new ArrayList<Integer>();

    int index = 1;
    int prev = 0;
    for (int i : num) {
      if (prev == 0) {
        prev = i;
        index++;
        continue;
      } else if (index == num.size()) {
        num2.add(i);
        break;
      } else if (i > prev) {
        prev = i;
        index++;
        continue;
      }
      num2.add(prev);
      prev = i;
      index++;
    }
    System.out.println(num);
    System.out.println(num2);
  }
}
