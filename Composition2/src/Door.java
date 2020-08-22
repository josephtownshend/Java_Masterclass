
public class Door {

  private final int height;
  private final int width;
  private boolean isOpen;

  public Door(int height, int width, boolean isOpen) {
    this.height = height;
    this.width = width;
    this.isOpen = isOpen;
  }

  public void openDoor() {
    this.isOpen = true;
  }

  public void closeDoor() {
    this.isOpen = false;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public boolean isOpen() {
    return isOpen;
  }

}

