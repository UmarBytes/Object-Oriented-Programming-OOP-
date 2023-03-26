class SalariedEmployee extends Employee{

	private double annualSalary;

	public SalariedEmployee(){
		super();
		this.setAnnualSalary(48000.0);
	}

	public SalariedEmployee(double annualSalary){
		super();
		this.setAnnualSalary(annualSalary);
	}

	public SalariedEmployee(double annualSalary , String name , int ID){
		super(name , ID);
		this.setAnnualSalary(annualSalary);
	}

	public void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary(){
		return this.annualSalary;
	}
	
	public double weeklyPay(){
		return this.getAnnualSalary() / 52;
	}

	public void display(){
		super.display();
		System.out.println("Annaul salary is : " + this.getAnnualSalary());
	}

 }