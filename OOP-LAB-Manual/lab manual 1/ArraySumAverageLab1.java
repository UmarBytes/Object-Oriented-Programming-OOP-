import java.util.Scanner;
public class ArraySumAverageLab1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int size;

		System.out.print("Enter the size of array : ");
		size = in.nextInt();

		while(size <= 0){

		System.out.print("Plz Enter the size greator than zero : ");		
		size = in.nextInt();
	}

	 	int[] array = new int[size];
		fillArray(array);
		printSumAverage(array);
	}

	public static void fillArray(int[] array){
		
		Scanner in = new Scanner(System.in);
		int size = array.length;

		for(int i=0 ; i < size ; i++){
			System.out.print("Enter the value for index " + i + " : ");
			array[i] = in.nextInt();
		}
	}
			
	public static void printSumAverage(int[] array){

		int size = array.length;

		int sum = 0;
		double average = 0.0;

		for (int i = 0 ; i < size ; ++i){
			sum += array[i];

	}
		average = (double) sum / size;

		System.out.println("Sum of all numbers of  array is : " + sum);
		System.out.println("Average of all numbers of array is : " + average);
	
		}

	}