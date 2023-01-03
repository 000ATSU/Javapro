package projava4;

import java.util.List;

public class InterfacePra {
  interface Figure {
    int width();

    int height();
  }

  record Box(int width, int height) implements Figure {
  }

  record Oval(int width, int height) implements Figure {
  }

  public static void main(String[] args) {
    var shape = List.of(new Box(10, 20), new Oval(50, 40));
    for (var s : shape) {
      var n = s.width();
      var m = s.height();
      System.out.println("幅は" + n + "で、" + "高さは" + m + "です。");
    }
  }
}
