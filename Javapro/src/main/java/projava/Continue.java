package projava;

public class Continue {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      switch (i) {
        case 3, 5 -> System.out.println("skip");
        default -> System.out.println(i);
      }
    }
  }
}

