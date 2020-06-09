
public class ForLoops {

  public static void main(String[] args) {

    // Ascending
    for(double i = 2.0; i < 9.0; i++) {
      System.out.println(String.format("%.2f", 10000*(i/100)));
    }

    System.out.println("*********************");

    // Descending
    for(double i = 8.0; i > 1.0; i--) {
      System.out.println(String.format("%.2f", 10000*(i/100)));
    }

  }

}

