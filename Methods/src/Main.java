
public class Main {

  public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculatorScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculatorScore(gameOver, 10000, 8, 200);
    System.out.println("Your final score was " + highScore);

    int result = calculateHighScorePosition(1500);
    displayHighScorePosition("Joe", result);

    result = calculateHighScorePosition(900);
    displayHighScorePosition("Loz", result);

    result = calculateHighScorePosition(400);
    displayHighScorePosition("Shoj", result);

    result = calculateHighScorePosition(50);
    displayHighScorePosition("Tim", result);

  }

  public static void displayHighScorePosition(String playerName, int position) {
     System.out.println(playerName + " managed to get into " + position + " position on the high score table.");
  }

  public static int calculateHighScorePosition(int playerScore) {
    if (playerScore > 1000) {
      return 1;
    } else if (playerScore > 500 && playerScore < 1000) {
      return 2;
    } else if (playerScore > 100 && playerScore < 500) {
      return 3;
    } else
      return 4;
  }




  public static int calculatorScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + levelCompleted * bonus;
      finalScore += 1000;
      return finalScore;
    }
    return -1;
  }

}

