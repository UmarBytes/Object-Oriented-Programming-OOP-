public class Car extends Vehicle {
	
	private String model;

	// default cons
	public Car() {
		super();
		this.setModel(null);
	}//default cons

	// overloaded cons
	public Car(String make, double price, String model) {
		super(make, price);
		this.setModel(model);
	}//overloaded cons

	public void setModel(String model) {
		this.model = model;
	}//setModel

	public String getModel() { return this.model; }

	@Override
	public String toString() {
		return(super.toString() + "Model: " + this.getModel() + "]");
	}//toString

	@Override
	public void displayState() {
		super.displayState();
		System.out.println("Model: " + this.getModel());
		System.out.println();
	}//displayState

}//class