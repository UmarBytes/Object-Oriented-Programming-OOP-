public class ArraySumEvenOddLab2{
	public static void main(String[] args){

		int[] array = {3, 2, 12, 15, 17, 22, 25, 26, 28};

		sumEvenOdd(array);

	}

	public static void sumEvenOdd(int[] array){
		
		int sumEven = 0 , sumOdd = 0;
		
		for (int i = 0 ; i < array.length ; i++) {

			if (array[i] % 2 == 0){

				sumEven += array[i];

			}

			else{
				sumOdd += array[i];
			}
		}

		System.out.println("Sum of all even numbers: " + sumEven);
		System.out.println("Sum of all odd numbers: " + sumOdd);



	}

	}
		