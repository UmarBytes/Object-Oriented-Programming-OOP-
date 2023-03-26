public class ArraySumOfDiagonalArrayLab4{
 	 public static void main(String[] args){

	int[][] array = {{5,7,9},{2,4,9},{3,6,8}};

	int result = getSumOfLeftDiagonal(array);

	if(result != -1)
		System.out.println("Sum of left diagonal is: " + result);

	else
		System.out.println("Rows and Columns are not equal.");
  }

	public static int getSumOfLeftDiagonal(int[][] array){

	if(array.length != array[0].length)
		return -1;

	int sum = 0;
	for(int i = 0 ; i < array.length ; i++)
	{
		for(int j = 0 ; j < array[i].length ; j++)
		{
			if(i == j)
				sum += array[i][j];
		}
	}
	return sum;
  }
}