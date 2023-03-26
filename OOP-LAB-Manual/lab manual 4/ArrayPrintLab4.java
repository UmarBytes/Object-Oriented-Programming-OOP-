import java.util.Scanner;
public class ArrayPrintLab4{
 	 public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	System.out.print("Enter the size of rows : ");
	int rows = in.nextInt();

	while(rows < 0){
	
		System.out.print("Plz Enter the size greater than 0 for rows : ");
		rows = in.nextInt();
	}
		
	System.out.print("Enter the size of columns : ");
	int columns = in.nextInt();

	while(columns < 0){
	
		System.out.print("Plz Enter the size greater than 0 for columns : ");
		columns = in.nextInt();
	}

	int[][] array = new int[rows][columns];

	fillArray(array);
	printArray(array);
  	
	}

	public static void fillArray(int[][] array){

	Scanner in = new Scanner(System.in);

	for (int i = 0 ; i < array.length ; i++) {
	  
		for (int j = 0 ; j < array[i].length ; j++){
		 
			System.out.print("Enter the value for index [" + i + "][" + j + "] : ");
			array[i][j] = in.nextInt();   
		}
		
	} 
	
  }

	public static void printArray(int[][] array){

	for (int i = 0 ; i < array.length ; i++){ 
	  
		for (int j = 0 ; j < array[i].length ; j++){
		
			System.out.println("Value that you have entered at index " + i + j + " is : " + array[i][j]); 
		}
		
	}
  }
}