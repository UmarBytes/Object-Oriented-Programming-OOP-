public class Substance{
	
	private int temperature;

	public void setTemperature(int temp){
		temperature = temp;
	}

	public int getTemperature(){
		return temperature;
	}

	public boolean isEthylFreezing(){
		return getTemperature() <= -173;
	}

	public boolean isEthylBoiling(){
		return getTemperature() >= 172;
	}

	public boolean isOxygenFreezing(){
		return getTemperature() <= -362;
	}

	public boolean isOxygenBoiling(){
		return getTemperature() >= -306;
	}

	public boolean isWaterFreezing(){
		return getTemperature() <= 32;
	}

	public boolean isWaterBoiling(){
		return getTemperature() >= 212;
	}

}