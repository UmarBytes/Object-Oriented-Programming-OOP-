/*
Question:      Write a Java program to convert a octal number to a decimal number.
*/
import java.util.Scanner;
public class Octal_to_Decimal{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	    System.out.print("Please enter a Octal Number:    ");
		long Octal = input.nextLong();
	long Decimal = 0;
	int i = 0;
	while(Octal != 0)
	   {
	Decimal = (long)(Decimal + (Octal % 10) * Math.pow(8, i++));
	Octal = Octal / 10;
	}//while
	          System.out.println("The Decimal Number is:  "+ Decimal);
        }//main
}//class