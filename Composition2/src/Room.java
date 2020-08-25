
public class Room {

  private final Carpet carpet;
  private final Door door;
  private final Windows window;

  private final int height;
  private final int width;
  private final int length;

  public Room(int height, int width, int length, Carpet carpet, Door door, Windows window) {
    this.height = height;
    this.width = width;
    this.length = length;
    this.carpet = carpet;
    this.door = door;
    this.window = window;
  }

  public void cleanRoom() {
    if(window.isClean() && carpet.isClean()) {
      System.out.println("Room is already clean.");
    } else if (!window.isClean() && !carpet.isClean()) {
      carpet.cleanCarpet();
      window.cleanWindow();
      System.out.println("Room is now clean.");
    } else if (!window.isClean()) {
      window.cleanWindow();
      System.out.println("Room is now clean.");
    } else if (!carpet.isClean()) {
      carpet.cleanCarpet();
      System.out.println("Room is now clean.");
    } else {
      carpet.cleanCarpet();
      window.cleanWindow();
      System.out.println("Room is now clean.");
    }
  }


  public Carpet getCarpet() {
    return carpet;
  }


  public Door getDoor() {
    return door;
  }


  public Windows getWindow() {
    return window;
  }
}

