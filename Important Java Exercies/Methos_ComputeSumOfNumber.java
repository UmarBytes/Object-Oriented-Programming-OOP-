import java.util.Scanner;
public class Methos_ComputeSumOfNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the Digit : ");
		int digit = input.nextInt();
	System.out.println("Sum of the Digit in an integer is : " + SumDigit(digit));
	
        }
     public static int SumDigit(long x){
	int result = 0;
		while(x > 0){
		result += x % 10;
		x /= 10;
		}
	return result;
        }
}