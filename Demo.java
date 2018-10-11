public class Demo{

  /* more methods can go here*/
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    //for the 3 distance functions below Determine: 
    //a)static/non-static
    //b)what class the method is located in
    //System.out.println(  distance(P1,P2)); //static in the demo class

    System.out.println(Point.distance(P1,P2)); //static in the Point class

    System.out.println(P1.distanceTo(P2)); //non-static in the Point class. 
    //It is IMPLIED strongly that this is non static because you need info from P1 to calculate the distance
    //You cannot tell by the calling style alone, this is why we prefer to use CLASS.Method() for static calls.
    System.out.println(P1.toString());
    System.out.println(P2.toString());
    System.out.println();

    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4); // Initializes a 3-4-5 triangle

    System.out.println(abc); //should print triangle in format specified on website
    System.out.println("\nPerimeter: " + abc.getPerimeter()); //should be 12.0

    System.out.println("\nVertices: " + abc.getVertex(0) + ", " + abc.getVertex(1) + ", " + abc.getVertex(2)); //should print individual vertices

    abc.setVertex(0, new Point(1, 1)); //sets point at the origin to (1,1)

    System.out.println("\nVertex A moved to " + abc.getVertex(0)); //should show new value as (1,1)

    System.out.println("New Perimeter: " + abc.getPerimeter()); //should be approximately 10.39 (truncated)
  }

}