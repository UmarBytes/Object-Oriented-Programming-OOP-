class HourlyEmployee extends Employee{

	private double hourlyWage;
	private int hoursWorkedPerWeek;

	public HourlyEmployee(){

		super();
		this.setHourlyWage(20.5);
		this.setHoursWorkedPerWeek(55);
	}

	public HourlyEmployee(double hourlyWage , int hoursWorkedPerWeek){

		super();
		this.setHourlyWage(hourlyWage);
		this.setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}

	public HourlyEmployee(double hourlyWage , int hoursWorkedPerWeek , String name , int ID){

		super(name , ID);
		this.setHourlyWage(hourlyWage);
		this.setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}

	public void setHourlyWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}

	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek){
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	public double getHourlyWage(){
		return this.hourlyWage;
	}

	public int getHoursWorkedPerWeek(){
		return this.hoursWorkedPerWeek;
	}

	public double weeklyPay(){

		final int routineWorkHours = 55;
		double weeklyPay = 0.0;

		if (this.getHoursWorkedPerWeek() <= routineWorkHours){
			weeklyPay = this.getHourlyWage() * this.getHoursWorkedPerWeek();
		}
		else{
			weeklyPay =  this.getHourlyWage() * routineWorkHours
			+ ((this.getHoursWorkedPerWeek() - routineWorkHours) * this.getHourlyWage() * 1.5);
		}
		return weeklyPay;
	}

	public void display(){

		super.display();
		System.out.println("Hourly wage is : " + this.getHourlyWage());
		System.out.println("Hours worked per week is : " + this.getHoursWorkedPerWeek());
	}

 }