public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {

    long result = kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour/1.609);
    return result;
  }

  public static void printConversion(double kilometersPerHour) {

    if (kilometersPerHour < 0) {
      System.out.println("Invalid value");
    } else {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour +
        " kph = " + milesPerHour +
        " mph");
    }
  }

}

