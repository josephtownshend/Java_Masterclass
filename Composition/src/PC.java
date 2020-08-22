
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

  public void powerUp() {
    theCase.pressPowerButton();
    drawLogo();
  }

  private void drawLogo() {
    // fancy graphics
    monitor.drawPixelAt(1200, 1200, "yellow");
  }

}

