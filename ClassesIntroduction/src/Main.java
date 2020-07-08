
public class Main {

  public static void main(String[] args) {

    Car porsche = new Car();
    Car holden = new Car();

    porsche.setDoors(5);
    holden.setDoors(3);
    porsche.setModel("Carrera");

    System.out.println("Model is " + porsche.getModel());
  }

}

