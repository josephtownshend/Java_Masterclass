
public class Main {

  public static void main(String[] args) {
    int newScore = calculateScore("Joe", 500);
    System.out.println("New score is " + newScore);

    int secondScore = calculateScore(1000);
    System.out.println("New score is " + secondScore);

    calculateScore();
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore(int score) {
    System.out.println("Unnamed scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("No player");
    return 0;
  }

}

