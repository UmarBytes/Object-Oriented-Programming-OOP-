import java.util.Scanner;
import java.util.Random;
public class Random_Number_Game{
         public static void main(String[] args) {
              //Press "0" for Rock
             //press "1" for paper
            //Press "3" for Scissor

        Scanner input = new Scanner(System.in);
                  System.out.print("Press :0: for Rock, Press :0: for Paper, Press :3: for Scissor // Enter Here ::  ");
                  int UserAction = input.nextInt();

                 Random random_num = new Random();
                int Computer_Input = random_num.nextInt(3);

       if (UserAction == Computer_Input) {
            System.out.println("\n\t\tDraw the Match");
        } else if (UserAction == 0 && Computer_Input == 2 || UserAction == 1 && Computer_Input == 0 || UserAction == 2 && Computer_Input == 1) {
 	            System.out.println("\n\t\tKO! You Win");
        } else
            	           System.out.println("\n\t\tComputer Win!");

       //System.out.println("Computer Choice is: " + Computer_Input);

        if(Computer_Input == 0)
        {
                          System.out.println("\n\t\tComputer choice is: Rock!");
        }
        else if (Computer_Input == 1)
        {
                       System.out.println("\n\t\tComputer Choice is: Paper!");
        }
        else if(Computer_Input == 2){
                      System.out.println("\n\t\tComputer Choice is: Scissor!");
        }


    }
}