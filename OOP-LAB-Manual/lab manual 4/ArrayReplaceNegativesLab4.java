import java.util.Scanner;
public class  ArrayReplaceNegativesLab4{
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the num of rows : ");
	int rows = in.nextInt();

	System.out.print("Enter the num of columns : ");
	int columns = in.nextInt();

	int[][] array = new int[rows][columns];

		for (int i = 0 ; i < array.length ; i++) {

		for (int j = 0 ; j < array[0].length ; j++) {

		System.out.print("Enter the value for index [" + i + "][" + j + "] : "); 
					array[i][j] = in.nextInt();  	
			}
	}
		 printArray(array);
		 replaceNegativeWithZeroes(array);
	}

	public static void printArray(int[][] array){

		for (int i = 0 ; i < array.length ; i++) {

			for (int j = 0 ;j < array[0].length ; j++) {

	System.out.println("Value that you have entered at index " + i + j + " is : " + array[i][j]); 
				}
		}
	} 

	public static void replaceNegativeWithZeroes(int[][] array){

		for (int i = 0 ; i < array.length ; i++) {

			for (int j = 0 ;j < array[0].length ; j++) {

				if(array[i][j] < 0){
					
				array[i][j] = 0;
					}
			}
				}
				
			printArray(array);
		}
}