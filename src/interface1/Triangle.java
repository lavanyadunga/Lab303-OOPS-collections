package interface1;

public class Triangle extends Shape implements Movable {
	   protected double triarea;
	   private int base, ht;   // x and y coordinates of the point
	   private int x, y;   // x and y coordinates of the point
	   
	   /** Constructs a MovablePoint instance at the given x and y */
	   public Triangle(int x, int y,int base, int ht) {
	       this.base = base;
	       this.ht = ht;
	       this.x = x;
	       this.y = y;
	       this.triarea = getArea();
	   }

	   public Triangle(double triarea) {
	       this.triarea = triarea;
	   }

	  
	@Override
	   public double getArea() {
	       //double area = PI * this.radius * this.radius;
	       double triarea = 0.5* base * ht; // initializing value in parent class variable
	       return triarea; //reference to  parent class variable
	   }
	   @Override
	   public void displayshapName() {
	       System.out.println("Drawing a area of Triangle " + this.triarea);
	   }
	   /** Returns a self-descriptive string */
	   @Override
	   public String toString() {
	       return "Triangle[ area = " + triarea + super.toString() +  "] ";
	   }

	   public String getCoordinate()
	   {
	     return  "(" + x + "," + y + ")";
	   }

	   // Need to implement all the abstract methods defined in the interface Movable
	   @Override
	   public void moveUp() {
	       y--;
	   }
	   @Override
	   public void moveDown() {
	       y++;
	   }
	   @Override
	   public void moveLeft() {
	      x--;
	   }
	   @Override
	   public void moveRight() {
	       x++;
	   }
	}




