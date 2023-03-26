import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class FileIOSecondSmallestLargestLab3{
 	 public static void main(String[] args) throws IOException{
  
	File file = new File("input-4-3.txt");
	Scanner input = new Scanner(file);

	PrintWriter output = new PrintWriter("output-4-3.txt");

	int[] array = new int[input.nextInt()];
	for(int i = 0; i<array.length; i++)
		array[i] = Integer.parseInt(input.next());

	int small2 = getSecondSmallestNumber(array);
	int large2 = getSecondLargestNumber(array);

	output.println("Second smallest number is: " + small2);
	output.println("Second largest number is: " + large2);

	System.out.println("Data is written to the file named \"output-4-3.txt\".");

	input.close();
	output.close();
	}

  public static int getSecondSmallestNumber(int[] array){
	Arrays.sort(array);

	return array[1];
	  }

  public static int getSecondLargestNumber(int[] array){
	Arrays.sort(array);
	int n = array.length;

	return array[n-2];
 	 }

	}