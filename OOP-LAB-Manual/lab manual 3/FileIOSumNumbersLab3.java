import java.util.Scanner;
import java.io.*;
public class FileIOSumNumbersLab3{
  	public static void main(String[] args) throws IOException{
  
	int sum = 0;

	File file = new File("input-2-3.txt");
	Scanner input = new Scanner(file);
	
	while(input.hasNext()){
	
		sum += Integer.parseInt(input.next());
	}

	input.close();

	PrintWriter output = new PrintWriter("output-2-3.txt");

	output.println("Sum is: " + sum);
	output.close();

	System.out.println("Data is written to the file named \"output-2-3.txt\".");
  	
	}

	}