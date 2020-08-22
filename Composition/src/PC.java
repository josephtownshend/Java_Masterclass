
public class PC {

  private final Case theCase;
  private final Monitor monitor;
  private final Motherboard motherboard;

  public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
    super();
    this.theCase = theCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public Case getCase() {
    return theCase;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }



}

