/*
QUESTION: Write a Java program to convert a decimal number to octal number
*/
import java.util.Scanner;
public class Dacimal_To_Octal{
	public static void main(String[] args){
	     Scanner input = new Scanner(System.in);
	System.out.print("Please enter a Dacimal  Number Here :   ");
	int DacimalNum = input.nextInt();
	   String Octal = "";
	while(DacimalNum != 0){
		int reminder = DacimalNum % 8;
		Octal = reminder + Octal;
		DacimalNum /= 8;
	}//while
		if(Octal.equals("")){
		     Octal = "0";
		}//if
	System.out.println("The Octal Number is :   " + Octal);
        }
}