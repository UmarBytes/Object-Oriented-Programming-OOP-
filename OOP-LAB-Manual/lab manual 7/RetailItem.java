public class RetailItem{

	private String description;
	private int unitsOnHand;
	private double price;

  	RetailItem(){
		setDescription("null");
		setUnitsOnHand(0);
		setPrice(0.0);
  }

  	RetailItem(String d, int uh, double p){
		setDescription(d);
		setUnitsOnHand(uh);
		setPrice(p);
  }

 	 void setDescription(String d){
		description = d;
  }

  	void setUnitsOnHand(int u){
		unitsOnHand = u;
  }

  	void setPrice(double p){
		price = p;
  }

  	String getDescription(){
		return description;
  }

  	int getUnitsOnHand(){
		return unitsOnHand;
  }

  	double getPrice(){
		return price;
  }

 	 void display(){
		System.out.println("\nDescription: " + getDescription());
		System.out.println("Units On Hand: " + getUnitsOnHand());
		System.out.println("Price: " + getPrice());
 }

 	 void copy(RetailItem r){
		r.setDescription(this.description);
		r.setUnitsOnHand(this.unitsOnHand);
		r.setPrice(this.price);
  }

  	public String toString(){
		String how = "\"" + getDescription() + ", " + getUnitsOnHand() + ", " + getPrice() + "\"";
		return how;
  }

  	boolean compare(RetailItem r){
		return (r.getDescription().equals(this.description) && r.getUnitsOnHand()==(this.unitsOnHand) && r.getPrice()==(this.price));
  }
}