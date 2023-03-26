public class ArrayReplaceWithNextMultipleLab2{
	public static void main(String[] args){

		int[] array =  {3, 8, 13, 18, 21, 24, 29, 36, 37, 41};
	System.out.println("Array before calling the replaceWithNextMultiplemethod:");

		printArray(array);

		replaceWithNextMultiple(array, 4);
	System.out.println("\nArray after calling the replaceWithNextMultiple method:");

		printArray(array);

	}

	public static void replaceWithNextMultiple(int[] array, int number){

	for (int i = 0 ; i < array.length ; i++) {

			if (array[i] % number != 0){

				array[i] = array[i] + number - array[i] % number;
			}
		}
		
	}

	public static void printArray(int[] array){

		for (int i = 0; i < array.length ; ++i) {

			System.out.print(array[i] + " ");

		}
	}

		}



























	









