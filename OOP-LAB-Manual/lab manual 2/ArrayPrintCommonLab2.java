public class ArrayPrintCommonLab2{
	public static void main(String[] args){

	int[] firstArray = {4, 2, 3, 17, 19, 12, 16, 7, 100};

	int[] secondArray = {3, 9, 5, 12, 6, 17, 8, 7};

	printCommon(firstArray , secondArray);

	}

	public static void printCommon(int[] firstArray, int[] secondArray){

		for (int i = 0 ; i < firstArray.length ; i++) {

			for (int j = 0 ; j < secondArray.length ; j++) {

				if (firstArray[i] == secondArray[j]){

					System.out.print(firstArray[i] + " ");
				}
			}
		}

	}


	}
		