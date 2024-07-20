package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumAll() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumAll(1, 10));
  }

  @Test
  public void testSumPart() {
    Calculate calculate = new Calculate();
    int expected = 9;
    assertEquals(expected, calculate.sumPart(1, 5));
    expected = 6;
    assertEquals(expected, calculate.sumPart(2, 5));
  }
}
