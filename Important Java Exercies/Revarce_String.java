/*
QUESTION: Write a Java program to reverse a string.
	Ex: uoY evoL I
*/
import java.util.Scanner;
public class Revarce_String{
	public static void main(String[] args){
	    Scanner input  = new Scanner(System.in);
	System.out.print("Enter the string :  ");
	char [] letter = input.nextLine().toCharArray();
	System.out.println("Reverce Steing:    ");
	for(int i = letter.length - 1; i >= 0; i-- ){
		System.out.print(letter[i]);
	}//for  
	System.out.println("\n");
       }//main
}//class