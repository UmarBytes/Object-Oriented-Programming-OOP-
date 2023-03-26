public class RunCar{
  public static void main(String[] args){

	Car a = new Car();
	Car b = new Car(2020 , "Mercedes", 500);
	
	System.out.println("\n...Default...");
	a.display();

	System.out.println("\n...Over Loaded...");
	b.display();

	a.setYearModel(2019);
	a.setMake("Toyota Corolla");
	a.setSpeed(400);

	System.out.println("\n...All...");
	a.display();
	b.display();

	System.out.println("\n...Copying a in b...");
	a.copy(b);
	b.display();

	System.out.println("\n...Comparing a with b...");
	System.out.println(a.compare(b));

	System.out.println("\n...String...");
	System.out.println(a.toString());

	System.out.println("\n...Accelerate...");
	a.accelerate();
	System.out.println(a.getSpeed());

	System.out.println("\n...Brake...");
	a.brake();
	System.out.println(a.getSpeed());
  }
}