import java.util.Scanner;
public class RunTemperature{
	public static void main(String[] args){

		Temperature temperature = new Temperature();

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the temperature in fahrenheit : ");
		int temp = in.nextInt();

		temperature.setFahrenheit(temp);

		System.out.println("Temperature in Celsius : " + temperature.getCelsius());
		System.out.println("Temperature in Kelvin : " + temperature.getKelvin());
	
	}
}