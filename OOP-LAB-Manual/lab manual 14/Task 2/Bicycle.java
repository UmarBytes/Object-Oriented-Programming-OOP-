class Bicycle extends Vehicle{

	private int gearCount;

	public Bicycle(){
		super("CCM" , "Pixie");
		this.setGearCount(6);
	}

	public Bicycle(int gearCount){
		super("CCM" , "Fort");
		this.setGearCount(gearCount);
	}

	public Bicycle(int gearCount , String brand , String model){
		super(brand , model);
		this.setGearCount(gearCount);
	}

	public void setGearCount(int gearCount){
		this.gearCount = gearCount;
	}

	public int getGearCount(){
		return this.gearCount;
	}

	public void display(){
		super.display();
		System.out.println("Gear count is : " + this.getGearCount());
	}

 }