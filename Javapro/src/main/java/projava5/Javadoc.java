package projava5;

public class Javadoc {
  /**
   * 渡された西暦年が夏季近代オリンピック開催年であるかどうか判定する
   *
   * @param year 西暦
   * @return 夏季オリンピック開催年であればture
   * @throws IllegalArgumentException まだオリンピックを開催が確定していない年を渡した場合
   */
  public static boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
    if (2023 < year) {
      throw new IllegalArgumentException("2023年までサポートしています。入力：" + year);
    }
    return year % 4 == 0;
  }

  public static void main(String[] args) {
    boolean x = isSummerOlympicYear(2012);
    System.out.println(x);
  }
}
