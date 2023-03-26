import java.util.Scanner;
public class RunTemperature{
  public static void main(String[] args){

	Temperature temp1 = new Temperature();
	Temperature temp2 = new Temperature(25);

	System.out.println("\n...Default...");
	temp1.display();

	System.out.println("\n...Over Loaded...");
	temp2.display();

	temp1.setFahrenheit(22);
	
	System.out.println("\n...All...");
	temp1.display();
	temp2.display();

	System.out.println("\n...Copying temp1 in temp2...");
	temp1.copy(temp2);
	temp2.display();

	System.out.println("\n...String Method...");
	System.out.println(temp1);

	System.out.println("\n...Comparing temp1 with temp2...");
	System.out.println(temp1.compare(temp2));
  }
}