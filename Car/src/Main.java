
public class Main {

  public static void main(String[] args) {

    Car car = new Car(8, "Base car");

    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Golf golf = new Golf(8, "Golf");

    System.out.println(golf.startEngine());
    System.out.println(golf.accelerate());
    System.out.println(golf.brake());
  }

}


class Car {

  private final int cylinders;
  private final String name;
  private final int wheels;
  private final boolean engine;


  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
    this.engine = true;
  }


  public String startEngine() {
    return "Car is starting engine.";
  }


  public String accelerate() {
    return "Car is accelerating.";
  }


  public String brake() {
    return "Car is braking.";
  }


  public int getCylinders() {
    return cylinders;
  }


  public String getName() {
    return name;
  }
}


class Golf extends Car {

  public Golf(int cylinders, String name) {
    super(cylinders, name);
  }


  @Override
  public String startEngine() {
    return getClass().getSimpleName() + "  is starting engine.";
  }


  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " is accelerating.";
  }


  @Override
  public String brake() {
    return getClass().getSimpleName() + " is braking.";
  }

}
