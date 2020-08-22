
public class Main {

  public static void main(String[] args) {

    Case theCase = new Case("220B", "Dell", "240", new Dimensions(20, 20, 5));

    Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540,1440));

    Motherboard motherboard = new Motherboard("JT-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, motherboard);
    thePC.powerUp();

  }
}
