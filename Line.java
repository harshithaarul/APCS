import java.util.*;

public class Line {
  Vect2 a;
  Vect2 b;
  public Line (Vect2 a, Vect2 b)  {
    this.a = a;
    this.b = b;
  }
  public double length() {
    double len;
    len = Math.pow(this.a.x-this.b.x, 2) + Math.pow(this.a.y-this.b.y, 2);
    len = Math.sqrt(len);
    return len;
  }
  public String toString() {
    String stringg = "";
    stringg = "((" + this.a.x + ", " + this.a.y + "), (" + this.b.x + ", " + this.b.y + "))" ;
    return stringg;
  }
  public Line rotate(double angle, Vect2 center) {
    return new Line(this.a.rotate(angle, center), this.b.rotate(angle, center));
  }
  public Line translate(Vect2 transform) {
    Vect2 aTransform = new Vect2(this.a.x + transform.x, this.a.y + transform.y);
    Vect2 bTransform = new Vect2(this.b.x + transform.x, this.b.y + transform.y);
    return new Line(aTransform, bTransform);
  }
}
