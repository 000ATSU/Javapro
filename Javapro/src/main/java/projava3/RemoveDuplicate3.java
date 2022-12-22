package projava3;

public class RemoveDuplicate3 {
  public static void main(String[] args) {
    var data = "abcdefghijk";

    int index = 1;
    char prev = 0;
    var builder = new StringBuilder();
    for (Character ch : data.toCharArray()) {
      if (index == data.length()) {
        builder.append(ch);
        continue;
      } else if (index % 2 != 0 && index <= data.length()) {
        prev = ch;
        index++;
        continue;
      }
      builder.append(ch);
      builder.append(prev);
      index++;
    }
    var result = builder.toString();
    System.out.println(data);
    System.out.println(result);
  }
}

