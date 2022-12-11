package projava2;

import java.math.*;

public class InstanceMethodSample {
  record Student(String name, int englishScore, int mathScore) {
    int averrage() {
      return (this.englishScore() + this.mathScore()) / 2;
    }

    String showResult() {
      return this.name() + "さんの平均点は" + averrage() + "です";
    }


    public int maxScore() {
      return Math.max(this.englishScore(), this.mathScore());
    }
  }

  public static void main(String[] args) {
    var kis = new Student("kis", 60, 80);
    var a = kis.averrage();
    var b = kis.showResult();
    var c = kis.maxScore();
    System.out.println("平均点は%d点です".formatted(a));
    System.out.println(b);
    System.out.println("最高点は%dです".formatted(c));
  }

//  static int averrage(Student s) {
//    return (s.englishScore() + s.mathScore()) / 2;
//  }
}
