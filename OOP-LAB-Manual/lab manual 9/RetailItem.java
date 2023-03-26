public class RetailItem{

	private String description;
	private int unitsOnHand;
	private double price;

	RetailItem(){

		this.setDescription("Kurta");
		this.setUnitsOnHand(24);
		this.setPrice(15.59);
	}

	RetailItem(String d, int u, double c){

		this.setDescription(d);
		this.setUnitsOnHand(u);
		this.setPrice(c);
	}

	public void setDescription(String desc){
		description = desc;
	}

	public void setUnitsOnHand(int units){
		unitsOnHand = units;
	}	

	public void setPrice(double p){
		price = p;
	}

	public String getDescription(){
		return description;
	}

	public int getUnitsOnHand(){
		return unitsOnHand;
	}

	public double getPrice(){
		return price;
	}	

	void display(){

		System.out.println("Description: " + getDescription());
		System.out.println("Units on hand: " + getUnitsOnHand());
		System.out.println("Price: " + getPrice());
	}

	void copy(RetailItem r){

		r.setDescription(this.getDescription());
		r.setUnitsOnHand(this.getUnitsOnHand());
		r.setPrice(this.getPrice());
	}

	public String toString(){
		return this.getDescription() + ", " + this.getUnitsOnHand() + ", " + this.getPrice();
	}

	boolean compare(RetailItem r){

		return this.getDescription().equals(r.getDescription()) &&
				this.getUnitsOnHand() == r.getUnitsOnHand() &&
				((this.getPrice() - r.getPrice()) < 0.000001);
				
	}

	boolean isNotEqual(RetailItem r){
		return !this.compare(r);
	}

	RetailItem create(RetailItem r){
		return new RetailItem(this.getDescription() + " " + r.getDescription(),
							this.getUnitsOnHand() + r.getUnitsOnHand(),
							this.getPrice() + r.getPrice());
	}
}