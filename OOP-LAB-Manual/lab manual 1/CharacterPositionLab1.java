import java.util.Scanner;
public class CharacterPositionLab1{
      public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	System.out.print("Enter a word : ");
	String word = in.nextLine();

	System.out.print("Enter a position : ");
	int position = in.nextInt();

	while(position < 0){

		System.out.print("Plz Enter the position greater than or equal to zero : ");
		position = in.nextInt();

		 }

	        char character = charAtPosition(word, position);
		System.out.println("The character at position " + position  + " is : " + character);

		}
	public static char charAtPosition(String word, int position){

		return word.charAt(position);

		}
	}


	