public class Computer{

	private final HardDisk HARDDISK;
	private final Ram RAM;
	private double price;
	private String make;

  	Computer(){
		HARDDISK = new HardDisk();
		RAM = new Ram();
		price = 0.0;
		make = "null";
  }

  	Computer(HardDisk HARDDISK , Ram RAM , double price , String make){
		this.HARDDISK = HARDDISK;
		this.RAM = RAM;
		this.price = price;
		this.make = make;
  }

  	Computer(Computer c){
		this.HARDDISK = c.HARDDISK;
		this.RAM = c.RAM;
		this.price = c.price;
		this.make = c.make;
  }

  	void setPrice(double price){ this.price = price; }
  	void setMake(String make){ this.make = make; }

  	HardDisk getHARDDISK(){ return HARDDISK; }
  	Ram getRAM(){ return RAM; }
  	double getPrice(){ return price; }
  	String getMake(){ return make; }

  	int getRamCapacity(){ 
		return (int)RAM.getCapacity();
  }

  	int getHardDiskCapacity(){
		return (int)HARDDISK.getCapacity();
  }

  	boolean isRamCostly(){
		return (RAM.getPrice() > HARDDISK.getPrice());
  }

  	boolean isDiskSSD(){
		return (HARDDISK.getType() == "SSD");
  }

  	void ComputerState(){
		System.out.println("\n...Computer State...");
		System.out.println("Price : " + getPrice() + "\nMake: " + getMake());

		HARDDISK.state();
		RAM.state();
  }
}