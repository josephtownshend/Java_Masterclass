
public class FirstAndLastDigitSum {

  public static void main(String[] args) {

    System.out.println(sumFirstAndLastDigit(11));
    System.out.println(sumFirstAndLastDigit(113));
    System.out.println(sumFirstAndLastDigit(2124858583));
  }


  public static int sumFirstAndLastDigit(int number) {

    if (number < 0) {
      return -1;
    } else if (number < 10) {
      return number * 2;
    }

    int lastDigit = number % 10;
    int firstDigit = number / 10;

    while (firstDigit >= 10) {
      firstDigit /= 10;
    }
    return firstDigit + lastDigit;
  }

}
