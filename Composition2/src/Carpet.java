
public class Carpet {

  private final String type;
  private final String colour;
  private boolean isClean;

  public Carpet(String type, String colour, boolean isClean) {
    this.type = type;
    this.colour = colour;
    this.isClean = isClean;
  }


  public void cleanCarpet() {
    if (isClean == true) {
      System.out.println("Carpet is already clean.");
    } else {
      System.out.println("Carpet is now clean.");
      isClean = true;
    }
  }


  public boolean isClean() {
    return isClean;
  }


  public String getColour() {
    return colour;
  }


  public String getType() {
    return type;
  }

}

