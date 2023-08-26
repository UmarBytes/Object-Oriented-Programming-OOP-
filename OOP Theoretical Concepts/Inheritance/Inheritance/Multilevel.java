/*
	#Multilevel inheritance
	*we will compile parent class name but will run that clas who have main mathod.

	Note:: in multilevel inheritance we can make the Object of thet class who have MAIN method 
			and excess all the other classes 
			* and if we want to RUN separately any of the Other Class 
			  we will just make The object of that class name 
			  # example is below 
*/

class Multilevel{
	
	void Multilevel_Inheritance(){
		System.out.println("we are going to be do the Multilevel inheritance....... ");
	}//void method 

}//class
class Employee_Name extends Multilevel{
	void empName(){
		System.out.println("The name of the employee is ::  WaliSultan ");
	}//void method 
	
}
class Employee_Designation extends Employee_Name{
	
	void empDesignation(){
		System.out.println("Employee is working on the designation of ::  CEO ");
	}//void method

}//class
class Employee_IdNumber extends Employee_Designation{

	void empIdNumber(){
		System.out.println("The Employee id is ::  101 ");
	}//void method 

}//class
class Employee_Salary extends Employee_IdNumber{

	void empSalary(){
		System.out.println("The totle employee salary is ::  110000$ ");
	}//void method
}//class
class Employee_WokingTime extends Employee_Salary{

	 void empWorkTime(){
	 	System.out.println("The working time of the Employee is ::  7:00 to 2:00 ");
	 }
}
class EmplloyeeRun extends Employee_WokingTime{	
	public static void main(String[] args) {
	

		EmplloyeeRun ob1 = new EmplloyeeRun();

		ob1.Multilevel_Inheritance();
		ob1.empName();
		ob1.empDesignation();
		ob1.empIdNumber();
		ob1.empSalary();
		ob1.empWorkTime();

		System.out.println("\n we just want to run any pf the single class separately......");
		// we just make an separately object 
		Employee_IdNumber id = new Employee_IdNumber();
			id.empIdNumber();
	}//main
}//class