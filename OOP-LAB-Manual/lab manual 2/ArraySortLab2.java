public class ArraySortLab2{
	public static void main(String[] args){

	int[] array = {1, 2, 1, 0, 0, 2, 1, 0, 1, 2, 2, 1, 1, 1, 0, 2, 1};

		System.out.println("Array before calling the sortArrayZeroOneTwo method:");

		printArray(array);

		sortArrayZeroOneTwo(array);
		System.out.println("\nArray after calling the sortArrayZeroOneTwo method:");

		printArray(array);

	}

	public static void sortArrayZeroOneTwo(int[] array){

		if (isValidArray(array)){
		
			int[] temp = new int[array.length];
			int c = 0;
			
			for (int i = 0 ; i < array.length; i++){
				if (array[i] == 0){

					temp[c] = array[i];
					c++;
				
				}
			}

			for (int i = 0 ; i < array.length ; i++){
				if (array[i] == 1){

					temp[c] = array[i];
					c++;
				
				}
			}

			for (int i = 0 ; i < array.length ; i++){
				if (array[i] == 2){

					temp[c] = array[i];
					++c;
				
				}
			}

			for (int i = 0; i < array.length; ++i){
				array[i] = temp[i];
			}

		}

	}

	public static boolean isValidArray(int[] array){

		boolean result = true;
		
		for (int i = 0; i < array.length; ++i) {

			if (array[i] < 0 || array[i] > 2){
				result = false;
			}
		}
		
		return result;

	}

	public static void printArray(int[] array){

		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}

	}


	}