package projava;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributes;

public class Maza {
  public static void main(String[] args) throws IOException {
    record Position(int x, int y) {
    }
    int[][] map = {
            {1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1}
    };

    var current = new Position(1, 3);
    var goal = new Position(3, 1);
    for (; ; ) {
      for (int y = 0; y < map.length; y++) {
        for (int x = 0; x < map.length; x++) {
          if (x == current.x() && y == current.y()) {
            System.out.print("o");
          } else if (map[y][x] == 1) {
            System.out.print("*");
          } else if (x == goal.x() && y == goal.y()) {
            System.out.print("G");
          } else {
            System.out.print(".");
          }
        }
        System.out.println();
      }
      if (current.equals(goal)) {
        System.out.println("GOAL!!");
        break;
      }
      int ch = System.in.read();
      var next = switch (ch) {
        case 'u' -> new Position(current.x() - 1, current.y());
        case 'h' -> new Position(current.x(), current.y() - 1);
        case 'j' -> new Position(current.x() + 1, current.y());
        case 'n' -> new Position(current.x(), current.y() + 1);
        default -> current;
      };
      if (map[next.y()][next.x()] == 0) {
        current = next;
      } else if (next == current) {
        System.exit(0);
      }
      System.in.read();
    }
  }
}
