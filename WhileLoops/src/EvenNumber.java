
public class EvenNumber {

  public static void main(String[] args) {

    int number = 4;
    int count = 0;
    int sum = 0;

    while(count != 5) {
      number++;
      if(!isEvenNumber(number)) {
        continue;
      }
      System.out.println("Even number found = " + number);
      sum += number;
      count++;
    }
    System.out.println("Total of even numbers found = " + sum);


  }


  public static boolean isEvenNumber(int input) {
    return input % 2 == 0 ? true : false;
  }

}

