public class FuelTank{

	private double litersFuel;
	private double maxFuelCapacity;

  	FuelTank(){
		litersFuel = maxFuelCapacity = 0.0;
  }

  	FuelTank(double litersFuel , double maxFuelCapacity){
		this.litersFuel = litersFuel;
		this.maxFuelCapacity = maxFuelCapacity;
  }

  	FuelTank(FuelTank f){
		this.litersFuel = f.litersFuel;
		this.maxFuelCapacity = f.maxFuelCapacity;
  }

  	void setLitersFuel(double litersFuel){ this.litersFuel = litersFuel; }
  	void setMaxFuelCapacity(double maxFuelCapacity){ this.maxFuelCapacity = maxFuelCapacity; }

  	double getLitersFuel(){ return litersFuel; }
  	double getMaxFuelCapacity(){ return maxFuelCapacity; }

  	void addFuel(double liters){

		if(!(isFull())){
	
			litersFuel += liters;
		if(litersFuel >= maxFuelCapacity){
		
			System.out.println("Tank full...");
			litersFuel -= liters;
		}
	}
  }

  	void removeFuel(double liters){
		if(!(isEmpty())){
	
			litersFuel -= liters;
		if(litersFuel < 0){
		
			System.out.println("Fuel in minus...");
			litersFuel += liters;
		}
	}
  }

  	boolean isEmpty(){
		return (getLitersFuel() == 0);
  }

  	boolean isFull(){
		return (getLitersFuel() == getMaxFuelCapacity());
  }

  	void currentFuelLevel(){
		System.out.println("Fuel Level : " + getLitersFuel());
		System.out.println("Max Fuel Capacity : " + getMaxFuelCapacity());
  }
}