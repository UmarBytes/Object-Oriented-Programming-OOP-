public class Employee implements Calculatable,Relateable,Displayable{

	private int hoursPerWeek;
	private int salaryPerHour;
	private int yearsOfService;

	Employee(){
		hoursPerWeek = 0;
		salaryPerHour = 0;
		yearsOfService = 0;
	}

	Employee(int hpw , int sph , int yos){

		hoursPerWeek = hpw;
		salaryPerHour = sph;
		yearsOfService = yos;
	}	

	void setHoursPerWeek(int hpw){
		hoursPerWeek = hpw;
	}

	void setSalaryPerHour(int sph){
		salaryPerHour = sph;
	}

	void setYearsOfService(int yos){
		yearsOfService = yos;
	}

	int getHoursPerWeek(){
		return hoursPerWeek;
	}

	int getSalaryPerHour(){
		return salaryPerHour;
	}

	int getYearsOfService(){
		return yearsOfService;
	}

	public double weeklySalary(){
		return hoursPerWeek*salaryPerHour;
	}

	public double annualSalary(){
		return hoursPerWeek*salaryPerHour*52;
	}

	public boolean isRankGreater(Employee e){

		if(this.annualSalary() > e.annualSalary()){
					return true;
	}
		else{
			return false;
	}
    }
	public boolean isSeniorEmployee(){

		if(this.yearsOfService >= 5){
				return true;
	}
		else{
			return false;
	}
    }	

	public void display(){

		System.out.println("Hours per week is : " + getHoursPerWeek());
		System.out.println("Salary per hour is : " + getSalaryPerHour());
		System.out.println("Years of service is : " + getYearsOfService());
		System.out.println("Weekly salary is : " + weeklySalary());
		System.out.println("Annual Salary is : " + annualSalary());
	}	
 }