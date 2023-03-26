import java.util.Scanner;
public class ArraySumAverageLab4{
  	public static void main(String[] args){	

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the number of rows : ");
	int rows = in.nextInt();

	System.out.print("Enter the number of columns : ");
	int columns = in.nextInt();

	int[][] array = new int[rows][columns];

	fillArray(array);
	printSumAverage(array);
  }

	public static void fillArray(int[][] array){

	Scanner in = new Scanner(System.in);

	for (int i = 0 ; i < array.length ; i++){ 
	  
		for (int j = 0 ; j < array[i].length; j++){
		 
			System.out.print("Enter the value for index [" + i + "][" + j + "] : ");
			array[i][j] = in.nextInt();   
		}
		
	} 
	
  }

	public static void printSumAverage(int[][] array){

	int sum = 0;
	double count = 0;

	for (int i = 0 ; i < array.length; i++) {
	   
		for (int j = 0 ; j < array[i].length ; j++){
		 
			sum += array[i][j];
			count++;  
		}
	}
	
	System.out.println("Sum of array elements is : " + sum);
	System.out.println("Average of array elements is : " + (sum/count));
  }
}