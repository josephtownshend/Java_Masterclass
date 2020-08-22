
public class Main {

  public static void main(String[] args) {


  Room room = new Room(
    10, 15, 20, new Carpet("Sisal", "brown", false),
    new Door(6, 3, false),
    new Windows(3, 3, false, true, true));

  room.cleanRoom();

  room.getWindow().openWindow();
  room.getWindow().closeWindow();

  }
}

