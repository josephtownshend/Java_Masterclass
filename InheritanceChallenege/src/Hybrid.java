
public class Hybrid extends Car {

  private final int roadServiceMonths;

  public Hybrid(int roadServiceMonths) {
    super("Hybrid", "2WD", 5, 5, 6, true);
    this.roadServiceMonths = roadServiceMonths;
  }

  Hybrid hybrid = new Hybrid(10);



}

