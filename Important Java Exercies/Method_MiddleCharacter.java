/*
QUESTION:  Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:                                                                          
The middle character in the string: 5
*/
import java.util.Scanner;
public class Method_MiddleCharacter{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	         System.out.print("Please anter The String Number : ");
		String star = input.nextLine();
	System.out.println("The Middile Chrectracter in this String is : " + Middle(star));
	}
     public static String Middle(String str){
	int position;
	int length;
	if(str.length() % 2 == 0)
	{
	position = str.length() / 2 - 1;
	length = 2;
	}
	else
	       {
	         position = str.length() / 2;
		length = 1;
 	        }
               return str.substring(position, position + length);
          }
}