import java.util.Scanner;
public class TablesLab1{
      public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	int num , start , end;

	System.out.print("Enetr the number :");
	num = in.nextInt();

	while(num < 0){

		System.out.print("Plz Enter the number greater than zero :");
		num = in.nextInt();

	}

	System.out.print("Enter the ending value :");
	end=in.nextInt();

	while(end < 0){	

		System.out.print("Plz enter the value greater than zero :");
		end = in.nextInt();

	}

	System.out.print("Enter the starting value :");
	start = in.nextInt();

	while(start < 0 || start > end){

		System.out.print("Plz Enter the num greater than zero and smaller than end value :");
		start = in.nextInt();

		}

	printTable(num , start , end);
	
	 }

	public static void printTable(int number , int start , int end){
		while(start<=end){

			int total = (number * start);
			System.out.println(number +" * "+ start +" = "+ total);
			start++;

	}
		}
}  
       