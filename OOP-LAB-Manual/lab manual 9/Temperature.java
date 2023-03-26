public class Temperature{
	
	private double ftemp;

	Temperature(){
		this.setFahrenheit(98.0);
	}

	Temperature(double f){
		this.setFahrenheit(f);
	}

	public void setFahrenheit(double temp){
		ftemp = temp;
	}

	public double getFahrenheit(){
		return ftemp;
	}

	public double getCelsius(){
		return (getFahrenheit() - 32) * 5 / 9;
	}

	public double getKelvin(){
		return ((double) ((5 / 9)) * (getFahrenheit() - 32)) + 273;
	}

	void display(){
		System.out.println("Temperature in fahrenheit: " + getFahrenheit());
	}

	void copy(Temperature t){
		t.setFahrenheit(this.getFahrenheit());
	}

	public String toString(){
		return Double.toString(this.getFahrenheit());
	}

	boolean compare(Temperature t){
		return ((this.getFahrenheit() - t.getFahrenheit()) < 0.000001);
	}

	Temperature create(Temperature t){
		return new Temperature(this.getFahrenheit() + t.getFahrenheit());
	}

}