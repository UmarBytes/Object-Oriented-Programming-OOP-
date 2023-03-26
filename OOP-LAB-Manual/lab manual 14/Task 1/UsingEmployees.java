class UsingEmployees{
	public static void main(String[] args) {

		HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(10.4 , 40);
		HourlyEmployee hourlyEmployee3 = new HourlyEmployee(16.6 , 57 , "Hamza" , 99);

		SalariedEmployee salariedEmployee1 = new SalariedEmployee();
		SalariedEmployee salariedEmployee2 = new SalariedEmployee(40000.0);
		SalariedEmployee salariedEmployee3 = new SalariedEmployee(57000.0 , "Ayeza" , 44);

		Manager manager1 = new Manager();
		Manager manager2 = new Manager(7500.0);
		Manager manager3 = new Manager(8500 , 50000.0 , "Aleena" , 92);

		System.out.println("Displaying details of hourlyEmployee #1 : ");
		hourlyEmployee1.display();
		System.out.println("Weekly pay is : " + hourlyEmployee1.weeklyPay());

		System.out.println("\nDisplaying details of hourlyEmployee #2 : ");
		hourlyEmployee2.display();
		System.out.println("Weekly pay is : " + hourlyEmployee2.weeklyPay());

		System.out.println("\nDisplaying details of hourlyEmployee #3 : ");
		hourlyEmployee3.display();
		System.out.println("Weekly pay is : " + hourlyEmployee3.weeklyPay());

		System.out.println("\n\nDisplaying details of salariedEmployee #1 : ");
		salariedEmployee1.display();
		System.out.println("Weekly pay is : " + salariedEmployee1.weeklyPay());

		System.out.println("\nDisplaying details of salariedEmployee #2 : ");
		salariedEmployee2.display();
		System.out.println("Weekly pay is : " + salariedEmployee2.weeklyPay());

		System.out.println("\nDisplaying details of salariedEmployee #3 : ");
		salariedEmployee3.display();
		System.out.println("Weekly pay is : " + salariedEmployee3.weeklyPay());

		System.out.println("\nDisplaying details of manager #1 : ");
		manager1.display();
		System.out.println("Weekly pay is : " + manager1.weeklyPay());

		System.out.println("\nDisplaying details of manager #2 : ");
		manager2.display();
		System.out.println("Weekly pay is : " + manager2.weeklyPay());

		System.out.println("\nDisplaying details of manager #3:");
		manager3.display();
		System.out.println("Weekly pay is : " + manager3.weeklyPay());

		System.out.println("\n\nDisplaying all employees by calling static display method : ");
		final int SIZE = 9;

		Employee[] employee = new Employee[SIZE];

		employee[0] = hourlyEmployee1;
		employee[1] = hourlyEmployee2;
		employee[2] = hourlyEmployee3;
		employee[3] = salariedEmployee1;
		employee[4] = salariedEmployee2;
		employee[5] = salariedEmployee3;
		employee[6] = manager1;
		employee[7] = manager2;
		employee[8] = manager3;
		Employee.display(employee);
	}
 }