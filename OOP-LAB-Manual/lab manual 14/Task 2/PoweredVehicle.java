class PoweredVehicle extends Vehicle{

	private String fuelType;

	public PoweredVehicle(){
		super("Ferrari" , "GTC4");
		this.setFuelType("Gasoline");
	}

	public PoweredVehicle(String fuelType){
		super("Ferrari" , "SP90");
		this.setFuelType(fuelType);
	}

	public PoweredVehicle(String fuelType , String brand , String model){
		super(brand , model);
		this.setFuelType(fuelType);
	}

	public void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}

	public String getFuelType(){
		return this.fuelType;
	}

	public void display(){
		super.display();
		System.out.println("Fuel type is : " + this.getFuelType());
	}

 }