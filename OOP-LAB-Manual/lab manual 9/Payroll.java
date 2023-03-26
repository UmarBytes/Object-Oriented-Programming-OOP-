public class Payroll{

	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numbersOfHoursWorked;

	Payroll(){

		this.setName("Iqra");
		this.setIdNumber(10);
		this.setHourlyPayRate(25.4);
		this.setNumbersOfHoursWorked(45.0);
	}

	Payroll(String n, int i, double r, double h){

		this.setName(n);
		this.setIdNumber(i);
		this.setHourlyPayRate(r);
		this.setNumbersOfHoursWorked(h);
	}

	public void setName(String n){
		name = n;
	}

	public void setIdNumber(int id){
		idNumber = id;
	}

	public void setHourlyPayRate(double rate){
		hourlyPayRate = rate;
	}

	public void setNumbersOfHoursWorked(double hours){
		numbersOfHoursWorked = hours;
	}

	public String getName(){
		return name;
	}

	public int getIdNumber(){
		return idNumber;
	}

	public double getHourlyPayRate(){
		return hourlyPayRate;
	}

	public double getNumbersOfHoursWorked(){
		return numbersOfHoursWorked;
	}

	public double grossPay(){
		return getHourlyPayRate() * getNumbersOfHoursWorked();
	}

	void display(){

		System.out.println("Name : " + getName());
		System.out.println("Id number : " + getIdNumber());
		System.out.println("Hourly Pay Rate : " + getHourlyPayRate());
		System.out.println("Numbers of hours worked : " + getNumbersOfHoursWorked());
	}

	void copy(Payroll p){

		p.setName(this.getName());
		p.setIdNumber(this.getIdNumber());
		p.setHourlyPayRate(this.getHourlyPayRate());
		p.setNumbersOfHoursWorked(this.getNumbersOfHoursWorked());
	}

	public String toString(){
		return this.getName() + ", " + this.getIdNumber() + ", " + this.getHourlyPayRate() + ", " + this.getNumbersOfHoursWorked();
	}

	boolean compare(Payroll p){

		return this.getName().equals(p.getName()) &&
				this.getIdNumber() == (p.getIdNumber()) &&
				((this.getHourlyPayRate() - p.getHourlyPayRate()) < 0.000001) &&
				((this.getNumbersOfHoursWorked() - p.getNumbersOfHoursWorked()) < 0.000001);
	}

	boolean isNotEqual(Payroll p){
		return !this.compare(p);
	}

	Payroll create(Payroll p){

		return new Payroll(this.getName() + " " + p.getName(),
				this.getIdNumber() + p.getIdNumber(),
				this.getHourlyPayRate() + p.getHourlyPayRate(),
				this.getNumbersOfHoursWorked() + p.getNumbersOfHoursWorked());
	}

}