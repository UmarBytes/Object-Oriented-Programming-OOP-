import java.util.Scanner;
public class RunPayRoll{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the details for employee #1 : ");

		System.out.print("Please enter the employee's name : ");
		String name = in.nextLine();

		System.out.print("Please enter the employee's id number : ");
		int id = in.nextInt();

		System.out.print("Please enter the employee's hourly pay rate : ");
		double rate = in.nextDouble();

		System.out.print("Please enter the employee's number of hours worked : ");
		double hours = in.nextDouble();

		Payroll obj1 = new Payroll();

		obj1.setName(name);
		obj1.setIdNumber(id);
		obj1.setHourlyPayRate(rate);
		obj1.setNumbersOfHoursWorked(hours);

		System.out.println("Amount of gross pay earned by employee #1 : " + obj1.grossPay());

		in.nextLine();
		System.out.println("\nEnter the details for employee #2: ");

		System.out.print("Please enter the employee's name : ");
		name = in.nextLine();

		System.out.print("Please enter the employee's id number : ");
		id = in.nextInt();

		System.out.print("Please enter the employee's hourly pay rate : ");
		rate = in.nextDouble();

		System.out.print("Please enter the employee's number of hours worked : ");
		hours = in.nextDouble();

		Payroll obj2 = new Payroll();

		obj2.setName(name);
		obj2.setIdNumber(id);
		obj2.setHourlyPayRate(rate);
		obj2.setNumbersOfHoursWorked(hours);

		System.out.println("Amount of gross pay earned by employee #2 : " + obj2.grossPay());

		in.nextLine();
		System.out.println("\nEnter the details for employee #3 : ");

		System.out.print("Please enter the employee's name : ");
		name = in.nextLine();

		System.out.print("Please enter the employee's id number : ");
		id = in.nextInt();

		System.out.print("Please enter the employee's hourly pay rate : ");
		rate = in.nextDouble();

		System.out.print("Please enter the employee's number of hours worked : ");
		hours = in.nextDouble();

		Payroll obj3 = new Payroll();

		obj3.setName(name);
		obj3.setIdNumber(id);
		obj3.setHourlyPayRate(rate);
		obj3.setNumbersOfHoursWorked(hours);

		System.out.println("Amount of gross pay earned by employee #3 : " + obj3.grossPay());

	}
}