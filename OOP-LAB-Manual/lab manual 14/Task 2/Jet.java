class Jet extends PoweredVehicle{

	private int engineCount;

	public Jet(){
		super("Avgas" , "Comac" , "C919");
		this.setEngineCount(5);
	}

	public Jet(int engineCount){
		super("Avgas" , "Comac" , "ARJ21");
		this.setEngineCount(engineCount);
	}

	public Jet(int engineCount , String fuelType , String brand , String model){
		super(fuelType , brand , model);
		this.setEngineCount(engineCount);
	}

	public void setEngineCount(int engineCount){
		this.engineCount = engineCount;
	}

	public int getEngineCount(){
		return this.engineCount;
	}

	public void display(){
		super.display();
		System.out.println("Engine count is : " + this.getEngineCount());
	}

 }