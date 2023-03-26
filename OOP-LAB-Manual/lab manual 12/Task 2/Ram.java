public class Ram{

	private double price;
	private double capacity;

  	Ram(){
		price = capacity = 0.0;
  }

  	Ram(double price , double capacity){
		this.price = price;
		this.capacity = capacity;
  }

  	Ram(Ram r){
		this.price = r.price;
		this.capacity = r.capacity;
  }

  	void setPrice(double price){ this.price = price; }
  	void setCapacity(double capacity){ this.capacity = capacity; }

  	double getPrice(){ return price; }
  	double getCapacity(){ return capacity; }

  	void state(){
		System.out.println("\n...Ram State...");
		System.out.println("Price : " + getPrice() + "\nCapacity : " + getCapacity());
  }
}