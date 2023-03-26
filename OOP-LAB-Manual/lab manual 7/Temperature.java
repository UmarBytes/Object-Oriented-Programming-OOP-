public class Temperature{

	private double fTemp;

  	Temperature(){
		setFahrenheit(0.0);
  }

 	 Temperature(double t){
		setFahrenheit(t);
  }

 	 void setFahrenheit(double f){
		fTemp = f;
  }

 	 double getFahrenheit(){
		return fTemp;
  }

  	double getCelsius(){
		return (0.5556) * (fTemp - 32);
  }

  	double getKelvin(){
		return ((0.5556) * (fTemp - 32)) + 273;
  }

 	 void display(){
		System.out.println("\nTemperature in Fahrenheit: " + getFahrenheit());
		System.out.println("Conversion in Celsius: " + getCelsius());
		System.out.println("Conversion in Kelvin: " + getKelvin());
  }

 	 void copy(Temperature t){
		t.setFahrenheit(this.fTemp);
  }

 	 public String toString(){
		String how = "\"" + getFahrenheit() + ", " + getCelsius() + ", " + getKelvin() + "\"";
		return how;
  }

 	 boolean compare(Temperature t){
		return t.getFahrenheit()==(this.fTemp);
  }
}