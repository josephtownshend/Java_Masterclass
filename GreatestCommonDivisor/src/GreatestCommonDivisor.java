
public class GreatestCommonDivisor {

  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(12, 100));
  }


  public static int getGreatestCommonDivisor(int first, int second) {

    if (first < 10 || second < 10) {
      return -1;
    }

    int max = Math.abs(first);
    int min = Math.abs(second);

    while (max > 0) {
        if (max < min) {
            int x = max;
            max = min;
            min = x;
        }
        max %= min;
    }

    return min;

  }
}

