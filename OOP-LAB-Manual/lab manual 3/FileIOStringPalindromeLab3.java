import java.io.*;
import java.util.Scanner;
public class FileIOStringPalindromeLab3{
 	 public static void main(String[] args) throws IOException{
  
	File file = new File("input-7-3.txt");
	Scanner input = new Scanner(file);

	String word = input.next();

	input.close();
	
	isPalindrome(word);
	
	  }

  public static void isPalindrome(String word) throws IOException{
  
	PrintWriter output = new PrintWriter("output7-3.txt");

	String check = reverseString(word);

	if(check.equals(word))

		output.println("Yes, the string is palindrome.");
	else

		output.println("No, the string is not palindrome.");

	System.out.println("Data is written to the file named \"output-7-3.txt\".");

	output.close();
	
	  }

	  public static String reverseString(String word){
			
	int length = word.length();

	String reverse = "";

    	for (int i = length-1 ; i >= 0 ; i--)
      		reverse = reverse + word.charAt(i);

	return reverse;
 
	 }

	}