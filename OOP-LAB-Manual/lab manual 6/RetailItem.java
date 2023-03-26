class RetailItem{

	private String description;
	private int unitsOnHand;
	private double price;

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

}