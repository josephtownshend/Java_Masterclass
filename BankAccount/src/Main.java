
public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    BankAccount bobsAccount = new BankAccount(12345, 0.00, "Bob", "bob@gmail.com", 1222222228);


    System.out.println(bobsAccount.getPhoneNumber());
    System.out.println(bobsAccount.getCustomerName());

    bobsAccount.withdraw(100);
    bobsAccount.deposit(200);


  }

}

