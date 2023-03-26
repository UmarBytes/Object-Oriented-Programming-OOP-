import java.util.Scanner;
public class RunSubstance{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the value for temperature : ");
		int temperature = in.nextInt();

		Substance substance = new Substance();
		substance.setTemperature(temperature);

		if (substance.isEthylFreezing()){
			System.out.println("Ethyl will freeze.");
		}

		if (substance.isEthylBoiling()){
			System.out.println("Ethyl will boil.");
		}

		if (substance.isOxygenFreezing()){
			System.out.println("Oxygen will freeze.");
		}

		if (substance.isOxygenBoiling()){
			System.out.println("Oxygen will boil.");
		}

		if (substance.isWaterFreezing()){
			System.out.println("Water will freeze.");
		}

		if (substance.isWaterBoiling()){
			System.out.println("Water will boil.");
		}
	
	}
}