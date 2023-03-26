public class ArrayPrintUniqueLab2{
	public static void main(String[] args){

	int[] array = {2, 4, 2, 15, 4, 5, 6, 9, 12, 2};

	printUnique(array);

	}

	public static void printUnique(int[] array){


	for (int i = 0 ; i < array.length ; i++) {

			boolean isUnique = true;

			for (int j = 0 ; j < array.length ; j++) {

				if (i != j){

					if (array[i] == array[j]){

						isUnique = false;
					}
				}
			}

			if (isUnique){
				System.out.print(array[i] + " ");
			}
		}

	}

	}
	
	
		