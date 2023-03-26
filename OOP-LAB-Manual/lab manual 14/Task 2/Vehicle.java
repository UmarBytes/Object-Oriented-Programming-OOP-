class Vehicle{

	private String brand;
	private String model;

	public Vehicle(){
		this.setBrand("Ferrari");
		this.setModel("SP90");
	}

	public Vehicle(String brand , String model){
		this.setBrand(brand);
		this.setModel(model);
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getBrand(){
		return this.brand;
	}

	public String getModel(){
		return this.model;
	}

	public void display(){
		System.out.println("Brand is : " + this.getBrand());
		System.out.println("Model is : " + this.getModel());
	}

	public static void display(Vehicle[] vehicles){

		for (int i = 0 ; i < vehicles.length ; i++) {
			vehicles[i].display();
			
		}
	}
 }