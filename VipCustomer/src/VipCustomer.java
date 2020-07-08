
public class VipCustomer {

  private final String name;
  private final double creditLimit;
  private final String email;

  // defaults
  public VipCustomer() {
    this("Bobby", 200.00, "bobby@BT.com");
  }


  // overloaded constructor
  public VipCustomer(String email) {
    this("Bobby", 200.00, email);

  }


  // constructor
  public VipCustomer(String name,
      double creditLimit,
      String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }


  public String getName() {
    return name;
  }


  public double getCreditLimit() {
    return creditLimit;
  }


  public String getEmail() {
    return email;
  }



}

