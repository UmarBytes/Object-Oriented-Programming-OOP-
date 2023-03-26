class SalariedEmployee extends Employee{

	private double annualSalary;

	SalariedEmployee(){
		super();
		annualSalary = 0;
	}

	SalariedEmployee(double annualSalary){
		this.annualSalary = annualSalary;
	}

	SalariedEmployee(String name , int ID,  double annualSalary){

		super(name , ID);
		this.annualSalary = annualSalary;
	}

	void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}

	double getAnnualSalary(){	
		return annualSalary;
	}

	double weeklyPay(){
		return annualSalary/52;
	}

	void display(){
		System.out.println("Name is : " + super.getName() + "\nID is : " + super.getID());
		System.out.println("Annual Salary is : " + getAnnualSalary() + "\nWeekly Pay is : " + weeklyPay());
	}
 }