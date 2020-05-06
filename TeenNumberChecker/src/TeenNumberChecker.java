
public class TeenNumberChecker {

  public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
    if (firstNum > 12 && firstNum < 20 || secondNum > 12 && secondNum < 20 || thirdNum > 12 && thirdNum < 20) {
      return true;
    }
    return false;
  }

  public static boolean isTeen(int firstNum) {
    if (firstNum > 12 && firstNum < 20) {
      return true;
    }
    return false;
  }

}

