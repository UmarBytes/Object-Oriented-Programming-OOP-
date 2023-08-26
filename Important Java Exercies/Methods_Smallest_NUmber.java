/*
QUESTION: Write a Java method to find the smallest number among three numbers. 
*/
import java.util.Scanner;
public class Methods_Smallest_NUmber{
	public static void main(String[] args){
	      Scanner input = new Scanner(System.in);
	System.out.print("Please enter the First Number :   ");
		int x = input.nextInt();
	System.out.print("Please enter the Second Number : ");
		int y = input.nextInt();
	System.out.print("Please enter the Third Number : ");
		int z = input.nextInt();
	System.out.println("The smallest Number is :  "+ smallest( x, y,z));

	}
	
       public static int smallest(int x, int y, int z)
       {
	return Math.min(Math.min(x,y),z);
       }
}