class Employee{
	abstract void start();	
}
class Car extends Abstract_Class{
	void start(){
		System.out.println("Car starts with Key");
	}
}
class Bike extends Abstract_Class{
	void start(){
		System.out.println("Bike starts with Kick");		
	}
	 public static void main(String[] args){
                             Car c =new Car();
		c.start();
	            Bike b = new Bike();
		b.start();
          }

}

