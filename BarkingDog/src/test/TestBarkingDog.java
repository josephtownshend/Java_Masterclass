package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BarkingDog;

public class TestBarkingDog {

  @Test
  public void testShouldWakeUp() {

    assertEquals(true, BarkingDog.shouldWakeUp(true, 7));
    assertEquals(false, BarkingDog.shouldWakeUp(true, 10));
    assertEquals(false, BarkingDog.shouldWakeUp(false, 10));
  }

}

