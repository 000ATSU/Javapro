package projava5;

public class isSummerOlympicYear {
  /**
   * 渡された西暦が夏季近代オリンピックの開催年であるかどうか判定する
   * @param year 西暦
   * @return　夏季オリンピック開催年であればture
   * @throws IllegalArgumentException まだオリンピックが開催していない年を渡した場合
   */
  public boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
    if (2032 < year) {
      throw new IllegalArgumentException("2032年までサポートしています。入力：" + year);
    }
    return year % 4 == 0;
  }

  public static void main(String[] args) {
    new isSummerOlympicYear()
  }
}
