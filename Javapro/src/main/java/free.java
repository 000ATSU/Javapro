public class free {
  public static void main(String[] args) {
    int a = 10;

    int count = 0;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        count++;
      }
    }

    System.out.println(count);
  }
}
