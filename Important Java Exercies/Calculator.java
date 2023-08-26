import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
	System.out.println("Outher is : Muhammad Umar Farooq Gujjar");
	System.out.println("\n\n\n--------******Simple Calculator****--------");
	boolean start = true;
	
		while(start){		
		System.out.println("\n\twelcome to Simple Calculator");
		System.out.println("\t\t\t (1) To add type a, to subtract, type s.");
		System.out.println("\t\t\t (2) To multiply, typem, to divide, type d.");
	Scanner input1 = new Scanner(System.in);
	String action = input1.nextLine();
	}//while
		
	if("a" .equals(action)){
		System.out.print("Enter the First Number: ");
		int num1 = input1.nextInt();

		System.out.print("Enter the second Number: ");
		int num2 = input1.nextInt();

		int sum = num1+num2;
		System.out.println(" Result ofSum " + num1 + " and " + num2 + "is" + sum);
	
	}//if
		if("s" .equals(action)){
		System.out.print("Enter the First Number: ");
		int num1 = input1.nextInt();

		System.out.print("Enter the secound Number: ");
		int num2 = input1.nextInt();
		
		int subtraction = num1-num2;
		System.out.println("Result of subtraction " + num1 + "and" + num2 + "is" +subtraction);

	}//if2

		if("m" .equals(action)){
		System.out.print("Enter the First Number: ");		
		int num1 = input1.nextInt();
		System.out.print("Enter the secound Number: ");
		int num2 = input1.nextInt();
		int multiplication = num1*num2;
		System.out.println("Result of multiplication " + num1 + "and" + num2 + "is" + multiplication);
}//if3

		System.out.print("\t\t\twould you like to start the program agian [y,n] ");
		Scanner input2 = new Scanner(System.in);
		String action1 = input2.nextLine();
		
		if("n" .equals(action1)){
		
		start = false;
		System.out.println("\t\t\tAllah Hafiz. Have a good day");

}
		


		}//main
	}//class