class ClassandObject {
		int id;
		String name;
		int salary;
	void EmployeeDetails(){
		System.out.println("\tEmployee ID is : "+ id);
		System.out.println("\tEmployee Name is : "+ name);
		System.out.println("\tEmployee Salary is : "+ salary);
	}
	//add a new object 	  
	void EmployeeDetails02(){
		System.out.println("\tEmployee ID is : "+ id);
		System.out.println("\tEmployee Name is : "+ name);
		System.out.println("\tEmployee Salary is : "+ salary);
	}
	
	public static void main(String args[]){
		System.out.println("\n\tEmployee Detailes\n ");
			ClassandObject emp01 = new ClassandObject();		
			ClassandObject emp02 = new ClassandObject();		

			emp01.id = 101;
			emp01.name = "Wali Sultan";
			emp01.salary = 3000014;
			emp01.EmployeeDetails();
			
			emp02.id = 105;
			emp02.name = "Haris Sultan";
			emp02.salary = 3000;
			emp02.EmployeeDetails();

	}
}