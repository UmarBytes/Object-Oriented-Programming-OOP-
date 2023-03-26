import java.util.Scanner;
public class InputMethodLab1{
        public static void main(String[] args){

      		getInput();


    }
       public static void getInput(){
		Scanner in = new Scanner(System.in);

		String name = " " ; 
		System.out.print("Enter the name :");
		name=in.nextLine();

		System.out.print("Enter the age :");
		int age = in.nextInt();

		while(age < 10 || age > 70){

		System.out.print("Plz Enter the age greater than 10 and less than 70 :");
		age=in.nextInt();
		
	}

		printInput(name,age);
	 }
	public static void printInput(String name , int age){

		System.out.println("Name is :"+ name); 
		System.out.println("Age is :"+ age);
	}	
}

        
      