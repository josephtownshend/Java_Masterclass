
public class Main {

  public static void main(String[] args) {

    int switchValue = 3;

    switch(switchValue) {
      case 1:
        System.out.println("Value was 1");
        break;

      case 2:
        System.out.println("Value was 2");
        break;

      case 3: case 4: case 5:
        System.out.println("Was a 3, or a 4, or a 5");
        break;

        default:
          System.out.println("Was not 1 or 2");
          break;
    }

    char myChar = 'E';

    switch(myChar) {
      case 'A':
        System.out.println("Char was A");
        break;

      case 'B':
        System.out.println("Char was B");
        break;

      case 'C':
        System.out.println("Char was C");
        break;

      case 'D': case 'E':
        System.out.println("Char was " + myChar);
        break;

        default:
          System.out.println("Char was not A, B, C, D or E");
          break;
    }

  }

}

