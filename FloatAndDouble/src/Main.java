
public class Main {
  public static void main(String[] args) {
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float minimum value = " + myMinFloatValue);
    System.out.println("Float maximum value = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double minimum value = " + myMinDoubleValue);
    System.out.println("Double maximum value = " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = (float) 5 / 3;
    float myFloatValue2 = 5.52f / 3f;
    double myDoubleValue = 5d / 3d;

    System.out.println("My int value = " + myIntValue);
    System.out.println("My float value = " + myFloatValue);
    System.out.println("My float value 2 = " + myFloatValue2);
    System.out.println("My double value = " + myDoubleValue);

    // Challenge - lbs to kg converter
    int numberOfPounds = 2;
    double numberOfKilos = numberOfPounds * 0.45359237;
    System.out.println(numberOfKilos);

  }
}

