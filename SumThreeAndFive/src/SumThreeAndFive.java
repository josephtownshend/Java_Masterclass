
public class SumThreeAndFive {

  public static void main(String[] args) {
    sumThreeAndFiveCalc();
  }


  public static void sumThreeAndFiveCalc() {

    int count = 0;
    int sum = 0;

    for (int i = 1; i <= 1000; i++) {
      if (i % 15 == 0) {
        count++;
        sum += i;
        System.out.println(i);
      }
      if (count == 5) {
        break;
      }
    }

    System.out.println(sum);
  }
}