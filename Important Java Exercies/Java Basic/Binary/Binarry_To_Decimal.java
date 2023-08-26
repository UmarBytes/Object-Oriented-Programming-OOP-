import java.util.Scanner;
public class Binarry_To_Decimal{
	public static void main(String[] args){
	    Scanner input =  new Scanner(System.in);
	System.out.print("Please enter a Binary Number Here:  ");
	int BinaryNum = input.nextInt();
	String DecimalNum = "";
	int temp = 1;
	     while(BinaryNum != 0){
	int reminder = BinaryNum % 10;
	DecimalNum = DecimalNum + reminder * temp;
	BinaryNum = BinaryNum /10;
	temp = temp * 2; 
	}
           System.out.println("The Decimal  Number is:     "+DecimalNum);
       }
}