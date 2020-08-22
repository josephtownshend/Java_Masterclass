
public class Windows {

  private final int height;
  private final int width;
  private final boolean isFrosted;
  private boolean isClean;
  private boolean isOpen;

  public Windows(int height, int width, boolean isFrosted, boolean isClean, boolean isOpen) {
    super();
    this.height = height;
    this.width = width;
    this.isFrosted = isFrosted;
    this.isClean = isClean;
    this.isOpen = isOpen;
  }

  public void cleanWindow() {
    if (isClean) {
      System.out.println("Windows are already clean.");
    } else {
      System.out.println("The windows are now clean.");
      isClean = true;
    }
  }

  public void openWindow() {
    if (isOpen) {
      System.out.println("Window is already open.");
    } else {
      System.out.println("Window is now open.");
      isOpen = true;
    }
  }

  public void closeWindow() {
    if (isOpen) {
      System.out.println("Window is now closed.");
      isOpen = false;
    } else {
      System.out.println("Window is already closed.");
    }
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public boolean isFrosted() {
    return isFrosted;
  }

  public boolean isClean() {
    return isClean;
  }

  public boolean isOpen() {
    return isOpen;
  }



}

