
public class SumOdd {

  public static void main(String[] args) {
    System.out.println(sumOdd(1, 11));
  }


  public static boolean isOdd(int number) {
    return number > 0 && number % 2 != 0 ? true : false;
  }


  public static int sumOdd(int start, int end) {

    int sum = 0;

    if (start > 0 && end >= start) {
      for (int i = start; i <= end; i++) {
        if (isOdd(i)) {
          sum += i;
        }
      }
      return sum;
    }
    return -1;
  }

}
