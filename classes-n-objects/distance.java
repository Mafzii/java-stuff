import java.lang.Math; 
class Point {

  // Private fields
  private int x;
  private int y;

  // Default Constructor
  public Point() {
    // Implement the function
    this.x=0;
    this.y=0;
  }

  // Parameterized Constructor
  public Point(int x, int y) { 
    // Implement the function
    this.x=x;
    this.y=y;
  }


  public double distance() {
    // Implement the function
    return Math.pow((this.x*this.x + this.y*this.y),0.5);
  }

  public double distance(int x2, int y2) {
    // Implement the function
    return Math.pow((this.x-x2)*(this.x-x2) + (this.y-y2)*(this.y-y2),0.5);
  }

}

class Demo {

  public static void main(String args[]) {
    Point p1 = new Point(5, 5);
    System.out.println(p1.distance());
    System.out.println(p1.distance(2, 1));
  }

}