

public class OperartorChallenge {

  public static void main(String[] args) {

    double firstValue = 2000d;

    double secondValue = 80.00d;

    double result = 100 * (firstValue + secondValue);

    double remainder = result % 40.00d;

    boolean evaluation;

    if (remainder == 0) {
      evaluation = true;
      System.out.println(evaluation);
    } else if (remainder != 0) {
      evaluation = false;
      System.out.println(evaluation + "You got some remainder!");
    }
  }



}

