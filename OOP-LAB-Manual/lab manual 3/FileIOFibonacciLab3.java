import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class FileIOFibonacciLab3{
  	public static void main(String[] args) throws IOException{
  
	File file = new File("input-5-3.txt");
	Scanner input = new Scanner(file);

	PrintWriter output = new PrintWriter("output-5-3.txt");

	int[] array = new int[input.nextInt()];
	for(int i = 0; i<array.length; i++)
		array[i] = Integer.parseInt(input.next());

	boolean check = isFibonacci(array);

	if(check)
		output.println("It is a fibonacci series.");
	else
		output.println("It is not a fibonacci series.");

	System.out.println("Data is written to the file named \"output-5-3.txt\".");

	input.close();
	output.close();

	  }

  	public static boolean isFibonacci(int[] array){

	Arrays.sort(array);

	for(int i = 2; i < array.length; i++){
    	
      		if ((array[i - 1] + array[i - 2]) != array[i])  
           			return false;  
    	}  
    	return true;
	
	  }
	
	}
	