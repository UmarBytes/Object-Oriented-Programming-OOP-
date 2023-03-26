public class RunPayRoll{
	public static void main(String[] args){
		Payroll obj1 = new Payroll();
		Payroll obj2 = new Payroll("Jannat" , 6 , 12.6 , 30.5);
		Payroll obj3 = new Payroll("Hamza" , 2 , 22.6 , 40.0);

		obj2.setName("Faraz");
		obj2.setIdNumber(1);
		obj2.setHourlyPayRate(15.5);
		obj2.setNumbersOfHoursWorked(23.8);

		obj3.setName("Noor");
		obj3.setIdNumber(9);
		obj3.setHourlyPayRate(18.8);
		obj3.setNumbersOfHoursWorked(15.9);

		System.out.println("Amount of gross pay earned by Employee #1 : " + obj1.grossPay());
		System.out.println("Amount of gross pay earned by Employee #2 : " + obj2.grossPay());
		System.out.println("Amount of gross pay earned by Employee #3 : " + obj3.grossPay());

		
		System.out.println("Displaying the details of Employee #1 :");
		obj1.display();
		System.out.println("\nDisplaying the details of Employee #2 :");
		obj2.display();
		System.out.println("\nDisplaying the details of Employee #3 :");
		obj3.display();

		
		obj2.copy(obj3);

		System.out.println("Calling toString() method of Employee #3 :");
		System.out.println(obj3.toString());

		

		if(obj2.compare(obj3)){
			System.out.println("Employee #2 and Employee #3 are equal.");
		}
		else{
			System.out.println("Employee #2 and Employee #3 are not equal.");
		}

		if (obj1.isNotEqual(obj2)){
			System.out.println("Employee #1 and Employee #2 are not equal.");
		}
		else{
			System.out.println("Employee #1 and Employee #2 are equal.");
		}

		Payroll anotherObject = obj1.create(obj2);

		System.out.println("\nDisplaying the details of newly created Payroll object :");
		anotherObject.display();

	}
}