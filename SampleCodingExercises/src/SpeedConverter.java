

public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {
    long result = kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour/1.609);
    return result;
  }
}

