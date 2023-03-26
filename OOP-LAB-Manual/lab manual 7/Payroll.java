public class Payroll{

	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;

 	 Payroll(){
		setName("null");
		setIdNumber(0);
		setHourlyPayRate(0.0);
		setNumberOfHoursWorked(0.0);
  }

 	 Payroll(String n, int id, double hp, double hw){
		setName(n);
		setIdNumber(id);
		setHourlyPayRate(hp);
		setNumberOfHoursWorked(hw);
  }

 	 void setName(String n){
		name = n;
  }

  	void setIdNumber(int id){
		idNumber = id;
  }

  	void setHourlyPayRate(double hp){
		hourlyPayRate = hp;
  }

  	void setNumberOfHoursWorked(double hw){
		numberOfHoursWorked = hw;
  }

 	 String getName(){
		return name;
  }

  	int getIdNumber(){
		return idNumber;
  }

  	double getHourlyPayRate(){
		return hourlyPayRate;
  }

  	double getNumberOfHoursWorked(){
		return numberOfHoursWorked;
  }

  	void display(){
		System.out.println("\nName: " + getName());
		System.out.println("ID: " + getIdNumber());
		System.out.println("Hourly pay rate: " + getHourlyPayRate());
		System.out.println("Number of hours worked: " + getNumberOfHoursWorked());
  }

  	void copy(Payroll p){
		p.setName(this.name);
		p.setIdNumber(this.idNumber);
		p.setHourlyPayRate(this.hourlyPayRate);
		p.setNumberOfHoursWorked(this.numberOfHoursWorked);
  }

  	public String toString(){
		String how = "\"" + getName() + ", " + getIdNumber() + ", " + getHourlyPayRate() + ", " + getNumberOfHoursWorked() + "\"";
		return how;
  }

  	boolean compare(Payroll p){
		return (p.getName().equals(this.name) && p.getIdNumber()==(this.idNumber) && p.getHourlyPayRate()==(this.hourlyPayRate) && p.getNumberOfHoursWorked()==(this.numberOfHoursWorked));
  }

 	 double grossPay(){
		return (numberOfHoursWorked * hourlyPayRate);
  }
}