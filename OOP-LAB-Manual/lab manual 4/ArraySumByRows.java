public class ArraySumByRows{
  	public static void main(String[] args){
	int[][] array = {{4, 5, 9}, {1,2,3}, {9, 10, 11}, {19, 25, 26}, {10,11, 12}};

	int[] sum = getSumByRows(array);

	System.out.print("\n{");

	for(int i = 0; i < sum.length ; i++)
	{
		System.out.print(sum[i] + ", ");
	}
	System.out.println("\b\b}");
  }

	public static int[] getSumByRows(int[][] array){

	int[] sum = new int[array.length];
	int count = 0;

	for(int i = 0 ; i < array.length ; i++){
	
		for(int j = 0 ; j < array[i].length ; j++){
		
			count += array[i][j];
		}
		sum[i] = count;
		count = 0;
	}
	return sum;
  }
}
		