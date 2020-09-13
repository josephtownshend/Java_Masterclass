
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

  public double itemizeHamburger() {
    double hamburgerPrice = this.price;

    System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll " + " price is " + this.price);

    if (this.additionalItemOne != null) {
      hamburgerPrice += this.additionalItemOnePrice;
      System.out.println("Added " + this.additionalItemOne + " for an extra " + this.additionalItemOnePrice);
    }

    if (this.additionalItemTwo != null) {
      hamburgerPrice += this.additionalItemTwoPrice;
      System.out.println("Added " + this.additionalItemTwo + " for an extra " + this.additionalItemTwoPrice);
    }

    if (this.additionalItemThree != null) {
      hamburgerPrice += this.additionalItemThreePrice;
      System.out.println("Added " + this.additionalItemThree + " for an extra " + this.additionalItemThreePrice);
    }

    if (this.additionalItemFour != null) {
      hamburgerPrice += this.additionalItemFourPrice;
      System.out.println("Added " + this.additionalItemFour + " for an extra " + this.additionalItemFourPrice);
    }

    return hamburgerPrice;

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

