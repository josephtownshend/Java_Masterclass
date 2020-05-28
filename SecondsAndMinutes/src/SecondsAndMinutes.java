
public class SecondsAndMinutes {

  public static String getDurationString(long minutes, long seconds) {
    if (minutes >= 0) {
      if (seconds >= 0 && seconds <=59) {
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
      }
    }
    return "invalid value";
  }

  public static String getDurationString(long seconds) {
      if (seconds >= 0) {
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
      }
    return "invalid value";
  }

}

