public class UsingCar{
  public static void main(String[] args){

	Engine e = new Engine(800 , "Diesel" , true , 250);

	FuelTank ft = new FuelTank(18.6, 30.5);

	Car c = new Car(e , ft , "Toyota Corolla" , 2020 , 2519000);

	System.out.println(c.getMaxFuelCapacity());
	System.out.println(c.getTopSpeed());
	System.out.println(c.reFuel());
	System.out.println(c.startCar());
	System.out.println(c.stopCar());

	c.currentCarState();
  }
}