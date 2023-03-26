public class UsingEmployees{

	public static void main(String[] args){

	HourlyEmployee hE = new HourlyEmployee();
	HourlyEmployee hE1 = new HourlyEmployee(150 , 50);
	HourlyEmployee hE2 = new HourlyEmployee("Zaha" , 3 , 190 , 45);

	SalariedEmployee sE = new SalariedEmployee();
	SalariedEmployee sE1 = new SalariedEmployee(40000);
	SalariedEmployee sE2 = new SalariedEmployee("Umar" , 4 , 500000);
	
	Manager m = new Manager();
	Manager m1 = new Manager(3000);
	Manager m2 = new Manager("Faraz" , 4 , 550000 , 4000);

	System.out.println("Hourly Employee : ");
	System.out.println();
	hE.display();
	System.out.println();
	hE1.display();
	System.out.println();
	hE2.display();

	System.out.println("\nSalaried Employee : ");
	System.out.println();
	sE.display();
	System.out.println();
	sE1.display();
	System.out.println();
	sE2.display();

	System.out.println("\nManager : ");
	System.out.println();
	m.display();
	System.out.println();
	m1.display();
	System.out.println();
	m2.display();

	}
 }