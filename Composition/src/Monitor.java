
public class Monitor {

  private final String manfacturer;
  private final int size;
  private final Resolution nativeResolution;


  public Monitor(String model, String manfacturer, int size, Resolution nativeResolution) {
    super();
    this.model = model;
    this.manfacturer = manfacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public void drawPixelAt(int x, int y, String colour) {
    System.out.println("Drawing pixel at " + x + "," + y + " colour " + colour);
  }

  private final String model;
  public String getModel() {
    return model;
  }

  public String getManfacturer() {
    return manfacturer;
  }

  public int getSize() {
    return size;
  }

  public Resolution getNativeResolution() {
    return nativeResolution;
  }
}

