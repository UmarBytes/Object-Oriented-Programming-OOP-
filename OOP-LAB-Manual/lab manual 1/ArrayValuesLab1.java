import java.util.Scanner;
public class ArrayValuesLab1{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		for(int i=0 ; i < array.length ; i++){

		System.out.print("Enter the value of array at index " + i + " : ");
		array[i] = in.nextInt();

		}

		int smallestNumber = smallest(array);
		System.out.println("The smallest value of the array is : " + smallestNumber);

		int largestNumber = largest(array);
		System.out.println("The largest value of the array is : " + largestNumber);

		double middleNumber = middle(array);
		System.out.println("The middle value of the array is : " + middleNumber);

	 }

	public static int smallest(int[] array){

		int size = array.length;
		int smallestValue = array[0];

		for (int i = 1 ; i < size ; ++i) {

			if (array[i] < smallestValue){
				smallestValue = array[i];
			}
	}
		return smallestValue;

		}

	public static int largest(int[] array){

		int size = array.length;
		int largestValue = array[0];

		for(int i = 1 ; i < size ; i++){

			if(array[i] > largestValue){
				largestValue = array[i];
			}
		}
			return largestValue;
 	}

    	public static double middle(int[] array){

		int size = array.length;
		double middleValue = 0;

		if (size % 2 == 1){
			middleValue = array[size / 2];
		}

		else{
			middleValue = array[size / 2 - 1] + array[size / 2];
		}

		return middleValue;

	}

		}








	