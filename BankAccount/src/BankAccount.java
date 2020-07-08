
public class BankAccount {

  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private long phoneNumber;


  // default constructor
  public BankAccount() {
    this(1234, 2.50, "Bobby", "bob@yahoo.com", 474747);
  }


  // overloaded constructor
  public BankAccount(int accountNumber,
      double balance,
      String customerName) {
    this(accountNumber, balance, customerName, "email@hotmail,com", 88888999);
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;

  }


  public BankAccount(int accountNumber,
      double balance,
      String customerName,
      String email,
      long phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public void setAccountNumber(int number) {
    this.accountNumber = number;
  }


  public int getAccountNumber() {
    return accountNumber;
  }


  public double getBalance() {
    return balance;
  }


  public void setBalance(double balance) {
    this.balance = balance;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public long getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public void deposit(int amount) {
    this.balance+=amount;
    System.out.println(amount + " deposited into account");
    System.out.println("New balance: " + this.balance);
  }


  public void withdraw(int amount) {
    if(this.balance - amount < 0) {
      System.out.println("Not enough funds, only " + this.balance + " avaliable.");
    } else {
    this.balance-=amount;
    System.out.println(amount + " withdrawn from account");
    System.out.println("New balance: " + this.balance);

    }
  }


}

