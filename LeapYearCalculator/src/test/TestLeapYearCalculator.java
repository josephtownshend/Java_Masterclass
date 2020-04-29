package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.LeapYearCalculator;

public class TestLeapYearCalculator {

  @Test
  public void shouldCalculateLeapYear() {

    assertEquals(true, LeapYearCalculator.isLeapYear(1600));
    assertEquals(true, LeapYearCalculator.isLeapYear(2000));
    assertEquals(true, LeapYearCalculator.isLeapYear(2400));

    assertEquals(false, LeapYearCalculator.isLeapYear(-1600));
    assertEquals(false, LeapYearCalculator.isLeapYear(2017));
  }

}

