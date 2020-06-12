
public class EvenDigitSum {

  public static void main(String[] args) {

    System.out.println(getEvenDigitSum(12148));
    System.out.println(getEvenDigitSum(2));
    System.out.println(getEvenDigitSum(10));
    System.out.println(getEvenDigitSum(-10));
    System.out.println(getEvenDigitSum(20));
    System.out.println(getEvenDigitSum(2000));

  }


  public static int getEvenDigitSum(int number) {

    if(number < 0) {
      return -1;
    }

    if (number <= 10 && number % 2 ==0) {
      return number;
    }

    int sum = 0;

    while(number >= 10) {

      int lastDigit = number % 10;

      if(lastDigit % 2 == 0) {
        sum += lastDigit;

      }
      number /= 10;
    }
    return sum;
  }

}
