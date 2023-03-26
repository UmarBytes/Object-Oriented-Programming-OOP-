class Car extends PoweredVehicle{

	private int engineType;

	public Car(){
		super("Gasoline" , "Ferrari" , "GTC4");
		this.setEngineType(1800);
	}

	public Car(int engineType){
		super("Gasoline" , "Ferrari" , "SP90");
		this.setEngineType(engineType);
	}

	public Car(int engineType , String fuelType , String brand , String model){
		super(fuelType , brand , model);
		this.setEngineType(engineType);
	}

	public void setEngineType(int engineType){
		this.engineType = engineType;
	}

	public int getEngineType(){
		return this.engineType;
	}

	public void display(){
		super.display();
		System.out.println("Engine type is : " + this.getEngineType());
	}

 }