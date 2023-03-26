import java.io.*;
import java.util.Scanner;
public class FileIOStringReplaceLab3{
  	public static void main(String[] args) throws IOException{
  
	File file = new File("input-6-3.txt");
	Scanner input = new Scanner(file);

	PrintWriter output = new PrintWriter("output-6-3.txt");

	String sentence = input.nextLine();

	String changed = replaceSpacesWithDots(sentence);
	output.println(changed);

	System.out.println("Data is written to the file named \"output-6-3.txt\".");

	input.close();
	output.close();
 	
	 }

 	 public static String replaceSpacesWithDots(String sentence){

	sentence = sentence.replaceAll(" " , ".");
	return sentence;

  	}

	}