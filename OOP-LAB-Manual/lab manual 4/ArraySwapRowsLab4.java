import java.util.Scanner;
public class  ArraySwapRowsLab4{
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the num of rows : ");
	int rows = in.nextInt();

		while(rows < 0){
					
			System.out.print("Enter the num of rows Again greater than zero : ");
			rows = in.nextInt();
					}

	System.out.print("Enter the num of columns : ");
	int columns = in.nextInt();

		while(columns < 0){
				
			System.out.print("Enter the num of col Again greater than zero : ");
			columns = in.nextInt();
				}

		int[][] array = new int[rows][columns];

		for (int i = 0 ; i < array.length ; i++) {

		for (int j = 0 ;j < array[0].length ; j++) {

				System.out.print("Enter the value for index [" + i + "][" + j + "] : ");
					array[i][j] = in.nextInt();  	
			}
		}
					
		 printArray(array);
		swapFirstAndLastRow(array);
					
	}

	public static void printArray(int[][] array){

		for (int i = 0 ; i < array.length ; i++) {

			for (int j = 0 ; j < array[0].length ; j++) {

					System.out.print(array[i][j] + " "); 
				}
		}
	}

	public static void swapFirstAndLastRow(int[][] array) {

		for(int j = 0 ; j < array[0].length ; j++){
				
			int temp_Array = array[0][j];
			array[0][j] = array[array.length-1][j];
			array[array.length-1][j] = temp_Array;
				}
					
			printArray(array);

		} 
}