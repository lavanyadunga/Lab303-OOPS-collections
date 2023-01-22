package interface1;


public class Rectangle extends Shape implements Movable {
	   protected double area;
	   private int x, y;   // x and y coordinates of the point
	   private int w, h;   // x and y coordinates of the point
	   //private final double PI = Math.PI;

	   /** Constructs a MovablePoint instance at the given x and y */
	   public Rectangle(int x, int y,int w, int h) {
	       this.w = w;
	       this.h = h;
	       this.x = x;
	       this.y = y;
	       this.area = getArea();
	   }

	   public Rectangle(double area) {
	       this.area = area;
	   }

	 
	@Override
	   public double getArea() {
	       //double area = PI * this.radius * this.radius;
	       double area = w * h; // initializing value in parent class variable
	       return area; //reference to  parent class variable
	   }
	   @Override
	   public void displayshapName() {
	       System.out.println("Drawing a area of Rectangle " + this.area);
	   }
	   /** Returns a self-descriptive string */
	   @Override
	   public String toString() {
	       return "Rectangle[ area = " + area + super.toString() +  "] ";
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








