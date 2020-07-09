
public class Calculator {

  private final Carpet carpet;
  private final Floor floor;

  public Calculator(Floor floor, Carpet carpet) {
    this.carpet = carpet;
    this.floor = floor;
  }

  public double getTotalCost() {

    return floor.getArea() * carpet.getCost();
  }

}

