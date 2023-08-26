class Employee{
	
 		int empid;
		String name;

	void PrintDetails(){
	 		System.out.println("Employee id   "+ empid);
	 		System.out.println("Employee name   "+ name);
	}
	void PrintDetails02(){
	 		System.out.println("Employee02 id   "+ empid);
	 		System.out.println("Employee02 name   "+ name);
	}
	public static void main(String args[]){

		Employee details = new Employee();
		Employee details02 = new Employee();
		
		details.empid = 12;
		details.name = "Umar"; 
		
		details02.empid = 12;
		details02.name = "Umar"; 

		details.PrintDetails();
		details02.PrintDetails();
      }
}