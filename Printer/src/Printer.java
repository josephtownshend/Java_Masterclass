
public class Printer {

  private int tonerLevel;
  private final boolean isDuplex;
  private int pageCount;


  public Printer(int tonerLevel, boolean isDuplex) {
    if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.isDuplex = isDuplex;
    this.setPageCount(0);
  }


  public int reFillToner(int amount) {
    if (amount >= 0 && amount <= 100) {
      if (this.tonerLevel + amount > 100) {
        return -1;
      }
      this.tonerLevel += amount;
      return this.tonerLevel;
    }
    return -1;
  }


  public int printPage(int amount) {
    int pagesToPrint = amount;
    if (isDuplex) {
      pagesToPrint = amount / 2 + amount % 2;
    }
    this.setPageCount(this.getPageCount() + pagesToPrint);
    return pagesToPrint;
  }


  public int getPageCount() {
    return pageCount;
  }


  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

}
