package projava5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

  @Test
  void 正の数の足し算() {
    assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4");
    assertEquals(6, new Calc().add(2, 4), "2 + 4 = 8");
  }

  @Test
  void 負の数の足し算() {
    assertEquals(-3, new Calc().add(-1, -2), "-1 + -2 = -3");
  }
}