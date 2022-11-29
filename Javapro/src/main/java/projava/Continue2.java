package projava;

public class Continue2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      switch (i) {
        case 3,4,5,6 -> System.out.println("skip");
        default -> System.out.println(i);
      }
    }
  }
}
