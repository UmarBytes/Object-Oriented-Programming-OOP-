public class ArraySumOfMiddleColumnsLab{
	public static void main(String[] args) {

		int[][] array = {{5,7,9,4,3},{2,4,9,7,6},{3,6,8,7,9},{1,9,7,9,6}};

		double result = getSumOfMiddleColumns(array); 
		System.out.println("Sum of Middle column is : " + result);

	}

	public static double getSumOfMiddleColumns(int[][] array){

		double sum = 0.0 ;
			if(array[0].length % 2 != 0){
			
				for (int i = 0 ; i < array.length ; i++) {
				
				sum += (array[i][array.length / 2]);
				}
			}
				else{
				
					for (int i = 0 ; i < array.length ; i++) {
					
				 sum += ((array[i][(array[0].length / 2 - 1)] + array[i][array[0].length / 2]) / 2 );
					}
				}
			
			return sum ;
	}
}