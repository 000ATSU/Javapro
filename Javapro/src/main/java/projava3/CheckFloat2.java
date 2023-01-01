package projava3;

public class CheckFloat2 {
  enum FloatState {
    START, INT, FRAC_START, FRAC, ZERO, FIN
  }

  static boolean check(String data) {
    var state = CheckFloat.FloatState.START;
    for (char ch : data.toCharArray()) {
      switch (state) {
        case START -> {
          if (ch == '0') {
            state = CheckFloat.FloatState.ZERO;
          } else if (ch >= '1' && ch <= '9') {
            state = CheckFloat.FloatState.INT;
          } else {
            return false;
          }
        }
        case ZERO -> {
          if (ch == '.') {
            state = CheckFloat.FloatState.FRAC_START;
          } else {
            return false;
          }
        }
        case INT -> {
          if (ch >= '0' && ch <= '9') {
            state = CheckFloat.FloatState.INT;
          } else if (ch == '.') {
            state = CheckFloat.FloatState.INT;
          } else {
            return false;
          }
        }
        case FRAC_START, FRAC -> {
          if (ch >= '1' && ch <= '9') {
            state = CheckFloat.FloatState.FRAC;
          } else if (ch == '0') {
            state = CheckFloat.FloatState.FIN;
          } else {
            return false;
          }
        }
        case FIN -> {
          if (ch != '0') {
            state = CheckFloat.FloatState.FRAC;
          } else {
            return false;
          }
        }
      }
    }
    return switch (state) {
      case ZERO, INT, FRAC -> true;
      default -> false;
    };
  }

  public static void main(String[] args) {
    System.out.println(check("0.12"));
  }
}
