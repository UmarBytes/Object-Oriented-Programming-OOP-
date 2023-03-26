public class ArrayPrintPrimesLab2{
	public static void main(String[] args){

		int[] array = {2, 4, 31, 12, 7, 47, 63, 41, 67, 55};
	
		printPrimes(array);



	}

	public static void printPrimes(int[] array){

		for (int i = 0 ; i < array.length ; i++) {

			if (isPrime(array[i])){

				System.out.print(array[i] + " ");			
			}
		}

	}
	
	public static boolean isPrime(int number){

		int sqrt = (int)Math.sqrt(number);
		boolean result = true;

		int i = 2;

		while (i <= sqrt){
			if (number % i == 0){

				result = false;

			}

			i++;
		}

		return result;

	}


	}
		