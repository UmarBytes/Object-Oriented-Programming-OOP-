public class ArrayMatricesAdditionLab4{
  	public static void main(String[] args){

	int[][] FM = {{9,8,7},{1,5,6},{9,7,5}};
	int[][] SM = {{1,2,3},{6,5,8},{3,4,9}};

	int[][] result = addMatrices(FM, SM);
	printArray(result);
  }

	public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix){

	int[][] result = new int[firstMatrix.length][firstMatrix[0].length];

	for(int i = 0 ; i < result.length ; i++){
	
		for(int j = 0 ; j < result[0].length ; j++){
		
			result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
		}
	}
	return result;
  }

	public static void printArray(int[][] array){
	
	for (int i = 0 ; i < array.length ; i++){ 
	  
		for (int j = 0 ; j < array[i].length; j++){
		 
			System.out.print(array[i][j] + "  ");
		}
		
	}
  }
}