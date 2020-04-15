
public class Main {

  public static void main(String[] args) {

    byte myByteValue = Byte.MAX_VALUE;
    short myShortValue = Short.MAX_VALUE;
    int myIntValue = Integer.MAX_VALUE;

    Long myLongValue = (long) (50000 + 10 * (myByteValue + myShortValue + myIntValue));

    System.out.println(myLongValue);
  }

}

