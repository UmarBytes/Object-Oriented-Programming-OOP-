/*
QUESTION: Write a Java method to compute the average of three numbers.
*/
import java.util.Scanner;
public class Method_Average{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter the Firts Number :   ");
		double x = input.nextDouble();
 	System.out.print("Please enter the Second Number :   ");
		double y = input.nextDouble();
	System.out.print("Please enter the Third Number :   ");
		double z = input.nextDouble();
	System.out.println("The Average of The Numbers is :  " + Average(x,y,z));
	}

      public static double Average(double x, double y, double z){
	return (x+y+z)/3;
    }
}