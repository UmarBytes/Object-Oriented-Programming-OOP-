import java.util.Scanner;
public class Dacimal_To_Binarry{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the Dacimale Number :  ");
	int number = input.nextInt();
	String binarry = "";
	while(number  != 0){
	int reminder = number % 2;
	binarry = reminder + binarry; 
		number /= 2;
	}//while
	if(binarry.equals(""))
	{
	     binarry = "0";
	}//if
	   System.out.println(binarry);
	}//main
}//class