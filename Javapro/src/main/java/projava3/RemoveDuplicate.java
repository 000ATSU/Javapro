package projava3;

public class RemoveDuplicate {
  public static void main(String[] args) {
    var data = "abccbaabcc";

    var builder = new StringBuilder();
    for (int i = 0; i < data.length(); i++) {
      char ch = data.charAt(i);
      if (i > 0 && ch == data.charAt(i - 1)) {
        continue;
      }
      builder.append(ch);
    }
    var result = builder.toString();
    System.out.println(data);
    System.out.println(result);
  }
}
