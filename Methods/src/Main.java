
public class Main {

  public static void main(String[] args) {

    calculatorScore(true, 800, 5, 100);
    calculatorScore(true, 10000, 8, 200);
  }

  public static void calculatorScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + levelCompleted * bonus;
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

}

