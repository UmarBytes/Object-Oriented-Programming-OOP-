import java.util.Scanner;
public class ArraySwapValuesLab1{
	public static void main(String[] args){
		
		int[] array = new int[10];
		Scanner in = new Scanner(System.in);

		for(int i=0 ; i < array.length ; i++){
		
		System.out.print("Enter the value of array at index " + i + " : ");
		array[i] = in.nextInt();
	
		}

		System.out.println("Array values before swaping : ");
		printArray(array);

		array = arraySwapValues(array);
		System.out.println("Array values after swaping : ");

		printArray(array);
	 
	}

	public static int[] arraySwapValues(int[] array){

		int size = array.length;
		int[] temp = new int[size];

		temp[size - 1] = array[0];

		for (int i = 1; i < size; ++i){
			temp[i - 1] = array[i];
		}
		return temp;
	}
	
	public static void printArray(int[] array){


		int size = array.length;

		for (int i = 0; i < size; ++i){
		System.out.println("Value of index " + i + " is : " + array[i]);
	}

		}
	}















	

	