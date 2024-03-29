package projava5;

import one.cafebabe.bc4j.BusinessCalendar;
import one.cafebabe.bc4j.UnitedStates;

import java.time.LocalDate;

import static one.cafebabe.bc4j.BusinessCalendar.JAPAN;
import static one.cafebabe.bc4j.BusinessCalendar.UNITED_STATES;

public class JpaneseHoiliday2022 {
  public static void main(String[] args) {
    BusinessCalendar.newBuilder().holiday(UNITED_STATES.PUBLIC_HOLIDAYS).build()
            .getHolidaysBetween(LocalDate.of(2023, 1, 1),
    LocalDate.of(2023,12, 31))
            .forEach(System.out::println);
  }
}
