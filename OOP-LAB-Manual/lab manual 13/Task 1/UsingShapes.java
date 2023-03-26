public class UsingShapes{

	public static void main(String[] args){

	Circle c = new Circle();
	Circle c1 = new Circle(4 , 7 , 9 , "Red");

	Square s = new Square();
	Square s1 = new Square(4.2 , "Blue");

	Rectangle r = new Rectangle();
	Rectangle r1 = new Rectangle(2.3 , 3.9 , "Green");

	System.out.println("Circle :");
	c.draw();
	System.out.println();
	c1.draw();

	System.out.println("\nSquare :");
	s.draw();
	System.out.println();
	s1.draw();
	
	System.out.println("\nRectangle :");
	r.draw();
	System.out.println();
	r1.draw();

	System.out.println("\nArea and Permimeter of Circle are : ");
	System.out.println("Area is : " + c1.calculateArea() + "\nPerimeter is : " + c1.calculatePerimeter());

	System.out.println("\nArea and Permimeter of Square are : ");
	System.out.println("Area is : " + s1.calculateArea() + "\nPerimeter is : " + s1.calculatePerimeter());

	System.out.println("\nArea and Permimeter of Rectangle are : ");
	System.out.println("Area is : " + r1.calculateArea() + "\nPerimeter is : " + r1.calculatePerimeter());

	r1.setLength(5.4);
	r1.setWidth(6.3);
	
	System.out.println("\nAfter changing the state of Rectangle");
	System.out.println("\nArea and Permimeter of Rectangle are : ");
	System.out.println("Area is : " + r1.calculateArea() + "\nPerimeter is : " + r1.calculatePerimeter());

	}
 }