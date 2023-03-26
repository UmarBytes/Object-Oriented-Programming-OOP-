public class HardDisk{

	private double price;
	private double capacity;
	private String type;

  	HardDisk(){
		price = capacity = 0.0;
		type = "null";
  }

  	HardDisk(double price , double capacity , String type){
		this.price = price;
		this.capacity = capacity;
		this.type = type;
  }

  	HardDisk(HardDisk h){
		this.price = h.price;
		this.capacity = h.capacity;
		this.type = h.type;
  }

  	void setPrice(double price){ this.price = price; }
  	void setCapacity(double capacity){ this.capacity = capacity; }
  	void setType(String type){ this.type = type; }

  	double getPrice(){ return price; }
  	double getCapacity(){ return capacity; }
  	String getType(){ return type; }

  	void state(){
		System.out.println("\n...HardDisk State...");
		System.out.println("Price : " + getPrice() + "\nCapacity : " + getCapacity() + "\nType: " + getType());
  }
}