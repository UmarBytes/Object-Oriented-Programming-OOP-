import java.util.Scanner;
public class ArrayNegativeBeforePositiveLab1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		for(int i=0 ; i < array.length ; i++){

		System.out.print("Enter the value of array at index at " + i + " : ");
		array[i] = in.nextInt();	  

	}
		System.out.println("Origianl values of array : ");
		printArray(array);

		array = negativeBeforePositive(array);
		System.out.println("Array values after calling negativeBeforePositive method : ");

		printArray(array);

		}

	public static int[] negativeBeforePositive(int[] array){

		int size = array.length;
		int[] temp = new int[size];
		int c = 0;
		
		for (int i = 0 ; i < size ; ++i){
			if (array[i] < 0){
				temp[c] = array[i];
				++c;				
			}
		}

		for (int i = 0 ; i < size ; ++i){
			if (array[i] >= 0){
				temp[c] = array[i];
				++c;				
			}
		}

		return temp;

	}


	public static void printArray(int[] array) {

		int size = array.length;

		for (int i = 0; i < size; ++i){
		System.out.println("Value of index " + i + " is: " + array[i]);
	}

		}
	}
















	