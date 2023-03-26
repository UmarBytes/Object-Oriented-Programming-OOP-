class Manager extends SalariedEmployee{

	private double weeklyBonus;
	
	Manager(){
		super();
		weeklyBonus = 0;
	}

	Manager(double weeklyBonus){
		this.weeklyBonus = weeklyBonus;
	}

	Manager(String name , int ID , double annualSalary , double weeklyBonus){

		super(name,ID,annualSalary);
		this.weeklyBonus = weeklyBonus;
	}

	void setWeeklyBonus(double weeklyBonus){	
		this.weeklyBonus = weeklyBonus;
	}

	double getWeeklyBonus(){
		return weeklyBonus;
	}

	double weeklyPay(){
		return (super.getAnnualSalary()/52)+weeklyBonus;
	}

	void display(){
		System.out.println("Name is : " + super.getName() + "\nID is : " + super.getID());
		System.out.println("Weekly Bonus is : " + getWeeklyBonus() + "\nWeekly Pay is : " + weeklyPay());

	}
 }