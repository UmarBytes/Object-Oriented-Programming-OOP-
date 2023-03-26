class HourlyEmployee extends Employee{

	private double hourlyWage;
	private int hoursWorkedPerWeek;

	HourlyEmployee(){
		super();
		hourlyWage = 0;
		hoursWorkedPerWeek = 0;
	}

	HourlyEmployee(double hourlyWage , int hoursWorkedPerWeek){

		this.hourlyWage = hourlyWage;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	HourlyEmployee(String name , int ID , double hourlyWage , int hoursWorkedPerWeek){

		super(name, ID);
		this.hourlyWage = hourlyWage;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	void setHourlyWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}

	void setHoursWorkedPerWeek(int hoursWorkedPerWeek){
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	double getHourlyWage(){
		return hourlyWage;
	}

	int getHoursWorkedPerWeek(){
		return hoursWorkedPerWeek;
	}

	double weeklyPay(){
		return hourlyWage * hoursWorkedPerWeek;
	}

	void display(){
		System.out.println("Name is : " + super.getName() + "\nID is : " + super.getID());
		System.out.println("Hourly Rate is : " + getHourlyWage());

		if(hoursWorkedPerWeek > 40){
			System.out.println("Weekly Pay is : " + (weeklyPay()*1.5));
		}
	else{
		System.out.println("Weekly Pay is : " + weeklyPay());
	}

	}
 }