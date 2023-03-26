public class TestVehicle {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("Honda", 3500000, "City");

		System.out.println(c1);
		System.out.println();
		System.out.println(c2);	
		System.out.println();

		c1.displayState();
		c2.displayState();

	}//main

}//class