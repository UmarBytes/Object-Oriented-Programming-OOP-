public class UsingComputer{
  public static void main(String[] args){

	HardDisk hd = new HardDisk(4000 , 900 , "SATA");
	Ram r = new Ram(4000 , 4);

	Computer c = new Computer(hd , r , 75000 , "APPLE");

	System.out.println(c.getRamCapacity());
	System.out.println(c.getHardDiskCapacity());
	System.out.println(c.isRamCostly());
	System.out.println(c.isDiskSSD());

	c.ComputerState();
  }
}