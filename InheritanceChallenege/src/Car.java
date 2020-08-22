
public class Car extends Vehicle {


  private final int wheels;
  private final int doors;
  private final int gears;
  private final boolean isManual;

  private int currentGear;

  public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.isManual = isManual;
    this.currentGear = 1;
  }


  public int getCurrentGear() {
    return currentGear;
  }


  public void changeCurrentGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
  }


  public void changeVelocity(int velocity, int direction) {
    move(velocity, direction);
    System.out.println("Car.changeVelocity(): Velocity " + velocity + " direction " + direction + ".");
  }


}

