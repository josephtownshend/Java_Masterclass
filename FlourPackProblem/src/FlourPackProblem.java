
public class FlourPackProblem {

  public static void main(String[] args) {
    System.out.println(canPack(1,5,9));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {

    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }

    int total = bigCount*5 + smallCount;

    if (total < goal) {
      return false;
    } else if (total == goal) {
      return true;
    } else {



    }




    return true;

  }

}

