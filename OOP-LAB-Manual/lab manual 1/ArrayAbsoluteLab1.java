import java.util.Scanner;
public class ArrayAbsoluteLab1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int size;

		System.out.print("Enter the size of array : ");
		size = in.nextInt();

		int[] array = new int[size];

		fillArray(array);
		absoluteArray(array);
		printArray(array);

	}

	public static void fillArray(int[] array){

		Scanner in = new Scanner(System.in);
		int size = array.length;

		for(int i=0 ; i < size ; i++){
			
		System.out.print("Enter the value of array at index " + i + " : ");
		array[i]=in.nextInt();	
	}
		 
		}

	public static void absoluteArray(int[] array){

		int size = array.length;

		for (int i = 0 ; i < size ; ++i){
			array[i] = Math.abs(array[i]);
	}
		}

	public static void printArray(int[] array){ 

		int size = array.length;
	
		for (int i = 0; i < size; ++i){
		System.out.println("Value of index at " + i + " is : " + array[i]);
	}
		}
	}
		
		







	
	