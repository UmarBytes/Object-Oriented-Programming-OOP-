public class RunRetailItem{
  public static void main(String[] args){

	RetailItem item1 = new RetailItem();
	RetailItem item2 = new RetailItem("Branded Kurta" , 35 , 45.59);

	System.out.println("\n...Default...");
	item1.display();

	item1.setDescription("Jacket");
	item1.setUnitsOnHand(15);
	item1.setPrice(54.98);

	System.out.println("\n...Over Loaded...");
	item2.display();

	System.out.println("\n...All...");
	item1.display();
	item2.display();

	System.out.println("\n...Copying item 1 in item 2...");
	item1.copy(item2);
	item2.display();

	System.out.println("\n...String Method...");
	System.out.println(item1);

	System.out.println("\n...Comparing item 1 with item 2...");
	System.out.println(item1.compare(item2));

  }
}