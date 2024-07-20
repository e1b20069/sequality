package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumAll(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public int sumPart(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i = i + 2) {
      sum = sum + i;
    }
    return sum;
  }

  public void Calcu() {
    int x = 2, y = 3;
    for (int i = 0; i < 10; i++) {
      if (y > x && x > 0) {
        if (y == x + 1) {
          System.out
              .println("Sum of " + x + " and " + y + " is " + sum(x, y) + " .Average is " + (sum(x, y) / 2) + " .");
        } else {
          System.out.println(
              "Sum of " + x + " to " + y + " is " + sumAll(x, y) + " .Average is " + sumAll(x, y) / (y - x + 1) + " .");
          if (x % 2 == 1) {
            System.out.println("Sum of odd of " + x + " to " + y + " is " + sumPart(x, y) + " .Sum of even is "
                + sumPart(x + 1, y) + " .");
          }
        }
      }
      x = 1;
      y++;
    }

  }
}
