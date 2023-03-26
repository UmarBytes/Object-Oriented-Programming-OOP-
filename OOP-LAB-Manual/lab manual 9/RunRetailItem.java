public class RunRetailItem{
	public static void main(String[] args){

		RetailItem obj1 = new RetailItem();
		obj1.setDescription("Jeans");
		obj1.setUnitsOnHand(11);
		obj1.setPrice(59.56);

		RetailItem obj2 = new RetailItem("Jacket", 42, 44.95);
		RetailItem obj3 = new RetailItem("Shirt", 18, 22.95);
		
		obj2.setDescription("T-shirt");
		obj2.setUnitsOnHand(40);
		obj2.setPrice(22.56);

		obj3.setDescription("Leather Belt");
		obj3.setUnitsOnHand(55);
		obj3.setPrice(20.09);

		System.out.println("Details for the item #1.");
		obj1.display();
		System.out.println("\nDetails for the item #2.");
		obj2.display();
		System.out.println("\nDetails for the item #3.");
		obj3.display();

		
		obj2.copy(obj3);

		System.out.println("Calling toString() method of item# 3 :");
		System.out.println(obj3.toString());

		

		if(obj2.compare(obj3)){
			System.out.println("Item# 2 and Item# 3 are equal.");
		}
		else{
			System.out.println("Item# 2 and Item# 3 are not equal.");
		}

		if (obj1.isNotEqual(obj3)){
			System.out.println("Item #1 and item #3 are not equal.");
		}
		else{
			System.out.println("Item #1 and item #3 are equal.");
		}

		RetailItem anotherItem = obj1.create(obj3);
		System.out.println("\nDisplaying the details of newly created Item :");
		anotherItem.display();

	}
}