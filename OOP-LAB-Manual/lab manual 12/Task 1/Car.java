public class Car{

	private final Engine ENGINE;
	private final FuelTank TANK;
	private String make;
	private int model;
	private double price;

  	Car(){

		this.ENGINE = new Engine();
		this.TANK = new FuelTank();
		make = "";
		model = 0;
		price = 0;
  }

  	Car(Engine ENGINE , FuelTank TANK , String make , int model , double price){
		this.ENGINE = ENGINE;
		this.TANK = TANK;
		this.make = make;
		this.model = model;
		this.price = price;
  }

  	Car(Car c){
		this.ENGINE = c.ENGINE;
		this.TANK = c.TANK;
		this.make = c.make;
		this.model = c.model;
		this.price = c.price;
  }

  	void setMake(String make){ this.make = make; }
 	void setModel(int model){ this.model = model; }
  	void setPrice(double price){ this.price = price; }

  	Engine getEngine(){ return ENGINE; }
 	FuelTank getFuelTank(){ return TANK; }

  	String getMake(){ return make; }
  	int getModel(){ return model; }

  	double getPrice(){ return price; }

 	double getMaxFuelCapacity(){
		return TANK.getMaxFuelCapacity();
  }

  	int getTopSpeed(){
		return ENGINE.getTopSpeed();
  }

  	double reFuel(){
		double liters = TANK.getMaxFuelCapacity() - TANK.getLitersFuel();
		TANK.addFuel(liters);
		return liters;
  }

  	boolean startCar(){
		if(!(ENGINE.isEngineRunning())){
	
		return ENGINE.startEngine();
	}
	else{
	
		TANK.removeFuel(10);
		return false;
	}
  }

  	boolean stopCar(){
		if(ENGINE.isEngineRunning()){
	
		return ENGINE.stopEngine();
	}
	else{
	
		return false;
	}
  }

  	void currentCarState(){

		System.out.println("Make : " + getMake());
		System.out.println("Model : " + getModel());
		System.out.println("Price : " + getPrice());
		TANK.currentFuelLevel();
		ENGINE.currentEngineState();

	if(ENGINE.isEngineRunning()){
	
		System.out.println("Car is in start state...");
	}
	else{
	
		System.out.println("Car is in stop state...");
	}
  }
}