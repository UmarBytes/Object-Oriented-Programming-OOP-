public class UsingShapes{
  public static void main(String[] args){

	Circle c = new Circle();
	Circle c1 = new Circle(2.0 , 2.0 , "Yellow" , 5);

	Square s = new Square();
	Square s1 = new Square(4 , "White");

	Rectangle r = new Rectangle();
	Rectangle r1 = new Rectangle(5 , 9 , "Green");

	c.draw();
	c1.draw();

	s.draw();
	s1.draw();

	r.draw();
	r1.draw();

	System.out.println("\n The Area of circle is : " + c1.calculateArea());
	System.out.println("The Perimeter of circle is : " + c1.calculatePerimeter());

	System.out.println("\nThe Area of square is : " + s1.calculateArea());
	System.out.println("The Perimeter of square is : " + s1.calculatePerimeter());

	System.out.println("\nThe Area of rectangle is : " + r1.calculateArea());
	System.out.println("The Perimeter of rectangle is : " + r1.calculatePerimeter());

	System.out.println("\n...After Changing state...");
	c.setX(3.3);
	c.setY(2.4);
	c.setRadius(3.5);
	c.setColor("Blue");

	s.setLength(6);
	s.setColor("Yellow");

	r.setLength(7);
	r.setWidth(6);
	r.setColor("Black");

	System.out.println("\nThe Area of circle is : " + c.calculateArea());
	System.out.println("The Perimeter of circle is : " + c.calculatePerimeter());

	System.out.println("\nThe Area of square is : " + s.calculateArea());
	System.out.println("The Perimeter of square is : " + s.calculatePerimeter());

	System.out.println("\nThe Area of rectangle is : " + r.calculateArea());
	System.out.println("The Perimeter of rectangle is : " + r.calculatePerimeter());
  }
}
	