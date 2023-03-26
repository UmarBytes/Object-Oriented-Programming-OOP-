class Payroll{
	private String name;
	private int idNumber;

	private double hourlyPayRate;
	private double numbersOfHoursWorked;

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

}