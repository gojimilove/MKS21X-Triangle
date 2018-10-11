public class Point{
  private double x,y;

  public Point(double X, double Y) {
    x=X;
    y=Y;
  }

  public Point(Point p) {
    x= p.x;
    y= p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  
  public double distanceTo(Point p) {
    return Math.sqrt( ((p.x - x) * (p.x - x)) + ((p.y - y) * (p.y - y)) );
  }

  public static double distance(Point p1, Point p2) {
    return p1.distanceTo(p2);
  }
 
  public String toString() {
    String point = "Point: (" + x + ", " + y + ")";
    return point;
  }
}