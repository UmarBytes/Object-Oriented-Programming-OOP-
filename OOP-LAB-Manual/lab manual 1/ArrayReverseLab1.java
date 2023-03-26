import java.util.Scanner;
public class ArrayReverseLab1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		for(int i=0 ; i < array.length ; i++){
	
		System.out.print("Enter the value of array at index " + i +" : ");
		array[i] = in.nextInt();  

		}
		
		System.out.println("Original values of array : ");
		printArray(array);

		array = reverseArray(array);
		System.out.println("Reverse values of array : ");

		printArray(array);

	}

	public static int[] reverseArray(int[] array){

		int size = array.length;

		int[] temp = new int[size];
			
		for (int i = 0; i < size; ++i){
				temp[size - 1 - i] = array[i];
		}			

		return temp;

	}
	
	public static void printArray(int[] array){

		int size = array.length;
		
		for(int i=0 ; i < size ; i++){

		System.out.println("Value of array at index " + i + " is : " + array[i]);
	}
		}
	
	}













 
	