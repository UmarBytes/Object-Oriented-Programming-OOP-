abstract class Abstract_Class{
	abstract void start();	
}
class Car extends Abstract_Class{
	void start(){
		System.out.printn("Car starts with Key");
	}
}
class Bike extends Abstract_Class{
	void start(){
		System.out.printn("Bike starts with Kick");		
	}
	 public static void main(String[] args){
                             Car c =new Car();
		c.start();
	            Bike b = new Bike();
		b.start();
          }

}