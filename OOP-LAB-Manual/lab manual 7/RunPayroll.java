public class RunPayroll{
  public static void main(String[] args){

	Payroll employee1 = new Payroll();
	Payroll employee2 = new Payroll("Ahmer", 4 , 500 , 7);

	System.out.println("\n...Default...");
	employee1.display();

	System.out.println("\n...Over Loaded...");
	employee2.display();

	employee1.setName("Asfand");
	employee1.setIdNumber(2);
	employee1.setHourlyPayRate(300);
	employee1.setNumberOfHoursWorked(6);

	System.out.println("\n...All...");
	employee1.display();
	System.out.println("\nGross Pay: " + employee1.grossPay());
	employee2.display();
	System.out.println("\nGross Pay: " + employee2.grossPay());

	System.out.println("\n...Copying employee1 in employee2...");
	employee1.copy(employee2);
	employee2.display();

	System.out.println("\n...String Method...");
	System.out.println(employee2);

	System.out.println("\n...Comparing employee1 with employee2...");
	System.out.println(employee1.compare(employee2));
  }
}