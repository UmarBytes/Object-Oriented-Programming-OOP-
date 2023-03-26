public class RunEmployee{
	public static void main(String[] args){

		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Ameer Hamza" , 47235 , "IT" , "Programmer");
		Employee emp3 = new Employee("Faraz" , 35476 , "Accounting" , "Vice President");
		
		emp2.setName("Jannat");
		emp2.setIdNumber(49);
		emp2.setDepartment("International Relations");
		emp2.setPosition("Assistant");

		emp3.setName("Lishay");
		emp3.setIdNumber(39);
		emp3.setDepartment("Marketing");
		emp3.setPosition("Manager");

		System.out.println("Details for the employee #1.");
		emp1.display();
		System.out.println("\nDetails for the employee #2.");
		emp2.display();
		System.out.println("\nDetails for the employee #3.");
		emp3.display();

		
		emp2.copy(emp3);

		System.out.println("Calling toString() method of Employee #3 :");
		System.out.println(emp3.toString());

		
		if(emp2.compare(emp3)){
			System.out.println("Employee #2 and Employee #3 are equal.");
		}
		else{
			System.out.println("Employee #2 and Employee #3 are not equal.");
		}

		if (emp1.isNotEqual(emp3)){
			System.out.println("Employee #1 and Employee #2 are not equal.");
		}
		else{
			System.out.println("Employee #1 and Employee #2 are equal.");
		}

		Employee anotherEmployee = emp1.create(emp3);
		System.out.println("\nDisplaying the details of newly created Employee :");
		anotherEmployee.display();


	}
}