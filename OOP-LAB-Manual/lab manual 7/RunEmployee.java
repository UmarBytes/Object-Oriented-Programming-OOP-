public class RunEmployee{
  public static void main(String[] args){

	Employee e1 = new Employee();
	Employee e2 = new Employee("Ameer Hamza" , 47235 , "IT", "Programmer");

	System.out.println("\n...Default...");
	e1.display();

	System.out.println("\n...Over Loaded...");
	e2.display();

	e1.setName("Faraz");
	e1.setIdNumber(35476);
	e1.setDepartment("Accounting");
	e1.setPosition("Vice President");
	
	System.out.println("\n...All...");
	e1.display();
	e2.display();

	System.out.println("\n...Copying e1 in e2...");
	e1.copy(e2);
	e2.display();

	System.out.println("\n...String Method...");
	System.out.println(e1.toString());

	System.out.println("\n...Comparing e1 with e2...");
	System.out.println(e1.compare(e2));
  }
}