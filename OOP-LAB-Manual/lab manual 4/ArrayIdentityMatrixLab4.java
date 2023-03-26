public class ArrayIdentityMatrixLab4{
 	 public static void main(String[] args){

	int[][] array = {{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}};
	
	boolean check = isIdentityMatrix(array);

	if(check)
		System.out.println("It is an identity matrix.");

	else
		System.out.println("It is NOT an identity matrix.");
  }

	public static boolean isIdentityMatrix(int[][] array){

	for(int i = 0 ; i < array.length ; i++){
	
		for(int j = 0 ; j < array[i].length ; j++){
		
			if(i == j){
			
				if(array[i][j] != 1)
					return false;
			}

			else{
			
				if(array[i][j] != 0)
					return false;
			}
		}
	}
	return true;
  }
}