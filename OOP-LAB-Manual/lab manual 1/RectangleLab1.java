import java.util.Scanner;
public class RectangleLab1{
	public static void main(String[] args){

	double inLength = getLength();
	double inWidth = getWidth();
	double inArea = getArea(inLength , inWidth);
	display(inLength , inWidth , inArea);
	
	 }
	
	public static double getLength(){
		Scanner in = new Scanner(System.in);
		double length;

		System.out.print("Enter the length :");
		length = in.nextDouble();

	while(length < 0){

		System.out.print("Plz Enter the length greater than zero :");
		length = in.nextDouble();

	}

		return length;
	}
	public static double getWidth(){
		double width;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the width :");
		width=in.nextDouble();

	while(width < 0){

		System.out.print("Plz Enter the value greater than zero :");
		width = in.nextDouble();

	}

		return width;
	}
	public static double getArea(double length , double width){

		double area = length * width;
		return area;
	}
	public static void display(double length , double width , double area){

		System.out.println("Length is :" + length);
		System.out.println("Width is :" + width);
		System.out.println("Area of rectangle is :" + area);
	}
}
		
	