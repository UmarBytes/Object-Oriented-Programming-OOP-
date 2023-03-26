public class Vehicle {
	
	private String make;
	private double price;

	// default cons
	public Vehicle() {
		this.setMake(null);
		this.setPrice(0.0);
	}//default cons

	// overloaded cons
	public Vehicle(String make, double price) {
		this.setMake(make);
		this.setPrice(price);
	}//overloaded cons

	public void setMake(String make) {
		this.make = make;
	}//setMake

	public void setPrice(double price) {
		this.price = price;
	}//setTitle

	public String getMake() { return this.make; }
	public double getPrice() { return this.price; }

	@Override
	public String toString() {
		return("[Make: " + this.getMake() + ", Price: " + this.getPrice() + ", ");
	}//toString

	public void displayState() {
		System.out.println("Make: " + this.getMake());
		System.out.println("Price: " + this.getPrice());
	}//displayState

}//class