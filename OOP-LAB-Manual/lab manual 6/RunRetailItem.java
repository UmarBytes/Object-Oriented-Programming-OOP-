public class RunRetailItem{
	public static void main(String[] args){

		RetailItem obj1 = new RetailItem();

		obj1.setDescription("Jacket");
		obj1.setUnitsOnHand(12);
		obj1.setPrice(59.95);

		RetailItem obj2 = new RetailItem();

		obj2.setDescription("Designer Jeans");
		obj2.setUnitsOnHand(40);
		obj2.setPrice(34.95);

		RetailItem obj3 = new RetailItem();

		obj3.setDescription("Shirt");
		obj3.setUnitsOnHand(20);
		obj3.setPrice(24.95);
		
		System.out.println("Details for the item #1.");
		System.out.println("\tDescription : " + obj1.getDescription());
		System.out.println("\tUnits on hand : " + obj1.getUnitsOnHand());
		System.out.println("\tPrice : " + obj1.getPrice());

		System.out.println("\nDetails for the item #2.");
		System.out.println("\tDescription : " + obj2.getDescription());
		System.out.println("\tUnits on hand : " + obj2.getUnitsOnHand());
		System.out.println("\tPrice : " + obj2.getPrice());

		System.out.println("\nDetails for the item #3.");
		System.out.println("\tDescription : " + obj3.getDescription());
		System.out.println("\tUnits on hand : " + obj3.getUnitsOnHand());
		System.out.println("\tPrice : " + obj3.getPrice());

	}
}