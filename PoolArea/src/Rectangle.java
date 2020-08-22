
public class Rectangle {

  private double width;
  private double length;

  public Rectangle(double width, double length) {
    this.setWidth(width < 0 ? 0 : width);
    this.setLength(length < 0 ? 0 : length);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getArea() {
    return width*length;
  }

}

