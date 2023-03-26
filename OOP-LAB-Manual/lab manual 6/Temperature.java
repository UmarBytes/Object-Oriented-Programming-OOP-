public class Temperature{
	
	private double ftemp;

	public void setFahrenheit(int temp){
		ftemp = temp;
	}

	public double getFahrenheit(){
		return ftemp;
	}

	public double getCelsius(){
		return ((double) (5 / 9)) * (getFahrenheit() - 32);
	}

	public double getKelvin(){
		return ((double) ((5 / 9)) * (getFahrenheit() - 32)) + 273;
	}

}