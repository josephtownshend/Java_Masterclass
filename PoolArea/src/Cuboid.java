
public class Cuboid extends Rectangle {

  private double height;

  public Cuboid(double width, double length, double height) {
    super(width, length);
    this.setHeight(height < 0 ? 0 : height);

  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }


  public double getVolume() {
    double area = getArea();
    return area * height;
  }

}

