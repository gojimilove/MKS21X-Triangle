public class Triangle {
	private Point v1,v2,v3;

	public Triangle(Point A, Point B, Point C) {
		v1 = A;
		v2 = B;
		v3 = C;
	}

	public Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
		v1 = new Point(Ax, Ay);
		v2 = new Point(Bx, By);
		v3 = new Point(Cx, Cy);
	}

	public double getPerimeter() {
		return Point.distance(v1, v2) + Point.distance(v2, v3) + Point.distance(v3, v1);
	}

	public Point getVertex(int i) {
		if (i == 0) return new Point(v1);
		else if (i == 1) return new Point(v2);
		return new Point(v3);
	}

	public void setVertex(int i, Point newP) {
		if (i == 0) v1 = newP;
		else if (i == 1) v2 = newP;
		else v3 = newP;
	}

	public String toString() {
		String triangle = "Triangle: A(" + v1.getX() + ", " + v1.getY() 
											+ ") B(" + v2.getX() + ", " + v2.getY() 
											+ ") C(" + v3.getX() + ", " + v3.getY() + ")";
		return triangle;
	}

}