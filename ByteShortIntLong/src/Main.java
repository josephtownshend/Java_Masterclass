public class Main {

  public static void main(String[] args) {

    // this demonstrates the overflow and underflow of different data types in java.

    // bit size is also called width - this is how much space they take up
    // not how many decimal places they occupy.

    // 8 bits
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    // 16 bits
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Byte Short Value = " + myMinShortValue);
    System.out.println("Byte Short Value = " + myMaxShortValue);

    // 32 bits
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Iteger Minimum Value = " + myMinIntValue);
    System.out.println("Iteger Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue + 1));

    // 64 bits
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Byte Long Value = " + myMinLongValue);
    System.out.println("Byte Long Value = " + myMaxLongValue);

  }
}

