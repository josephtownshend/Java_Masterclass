
public class Hamburger {

  private final String name;
  private final String breadRoll;
  private final String meat;
  private final double price;

  private String additionalItemOne;
  private double additionalItemOnePrice;

  private String additionalItemTwo;
  private double additionalItemTwoPrice;

  private String additionalItemThree;
  private double additionalItemThreePrice;

  private String additionalItemFour;
  private double additionalItemFourPrice;


  Hamburger(String name, String breadRoll, String meat, double price) {
    this.name = name;
    this.breadRoll = breadRoll;
    this.meat = meat;
    this.price = price;
  }

  public void addHamburgerAddition1(String name, double price) {
    this.additionalItemOne = name;
    this.additionalItemOnePrice = price;
  }

  public void addHamburgerAddition2(String name, double price) {
    this.additionalItemTwo = name;
    this.additionalItemTwoPrice = price;
  }

  public void addHamburgerAddition3(String name, double price) {
    this.additionalItemThree = name;
    this.additionalItemThreePrice = price;
  }

  public void addHamburgerAddition4(String name, double price) {
    this.additionalItemFour = name;
    this.additionalItemFourPrice = price;
  }

  public String getBreadRoll() {
    return breadRoll;
  }

  public String getMeat() {
    return meat;
  }

  public double getPrice() {
    return price;
  }


}

