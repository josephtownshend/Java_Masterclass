package main;

public class DecimalComparator {

  public static double areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

    float numberOneRound = Math.round(numberOne);
    float numberTwoRound = (float) numberTwo;

    if (numberOneRound == numberTwoRound) {
      System.out.println("true");
      System.out.println(numberOneRound);
      System.out.println(numberTwoRound);

    } else {
      System.out.println("False");
      System.out.println(numberOneRound);
      System.out.println(numberTwoRound);
    }
    return numberTwo;
  }
}

