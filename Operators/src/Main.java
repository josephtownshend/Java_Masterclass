
public class Main {

  public static void main(String[] args) {

    int result = 1 + 2; // 1 + 2 = 3
    System.out.println(result);

    int previousResult = result;
    System.out.println(previousResult);

    result = result - 1;
    System.out.println(result);

    result = result * 10;
    System.out.println(result);

    result = result / 5;
    System.out.println(result);

    result = result % 3;
    System.out.println(result);

    result++;
    System.out.println(result);

    result--;
    System.out.println(result);

    result += 2;
    System.out.println(result);

    result -= 1;
    System.out.println(result);

    result *= 5;
    System.out.println(result);

    result /= 2;
    System.out.println(result);

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It is not an alien!");
    }

    int topScore = 100;
    if (topScore == 100) {
      System.out.println("You got the high score");
    }

    int secondTopScore = 60;
    if (topScore > secondTopScore && topScore < 100) {
      System.out.println("Greater than sceond top score and less than 100");
    }

    int thirdTopScore = 60;
    if (topScore < topScore || thirdTopScore == secondTopScore) {
      System.out.println("Third Score is less than top score OR equal to second score");
    }

    int newValue = 50;
    if (newValue == 50)
      System.out.println("newValue is the same as 50!");

    boolean isCar = false;
    if (isCar == true) {
      System.out.println("This is not supposed to happen");
    }

    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }

  }

}

