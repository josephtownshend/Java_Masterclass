public class Main {

  public static void main(String[] args) {

    // this demonstrates the overflow and underflow of different data types in java.

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Iteger Minimum Value = " + myMinIntValue);
    System.out.println("Iteger Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue + 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Byte Short Value = " + myMinShortValue);
    System.out.println("Byte Short Value = " + myMaxShortValue);

    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Byte Long Value = " + myMinLongValue);
    System.out.println("Byte Long Value = " + myMaxLongValue);


  }
}

