import java.util.Scanner;
class Dacimal_To_Hexadacimal{
    public static void main(String[] args) {
        char Hex [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	            Scanner input = new Scanner(System.in);
	            System.out.print("Please enter a dasimale number : ");
	            int number = input.nextInt();
	            String Hexa_dacimal = "";
	            while(number != 0)
            {
	                int remainder = number % 16;
	                Hexa_dacimal = Hex[remainder] + Hexa_dacimal;
	                number /= 16;
	            }
	            if(Hexa_dacimal.equals(""))
            	      {
                		Hexa_dacimal = "0";
            }
        	System.out.println("Hexa Dacimale Number is :  "+Hexa_dacimal);

        }//main
    }//class

