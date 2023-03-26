class Manager extends SalariedEmployee{

	private double weeklyBonus;

	public Manager(){
		super();
		this.setWeeklyBonus(65000.0);
	}

	public Manager(double weeklyBonus){
		super();
		this.setWeeklyBonus(weeklyBonus);
	}

	public Manager(double weeklyBonus , double annualSalary , String name , int ID){
		super(annualSalary , name , ID);
		this.setWeeklyBonus(weeklyBonus);
	}

	public void setWeeklyBonus(double weeklyBonus){
		this.weeklyBonus = weeklyBonus;
	}

	public double getWeeklyBonus(){
		return this.weeklyBonus;
	}

	public double weeklyPay(){
		return super.weeklyPay() + this.getWeeklyBonus();
	}

	public void display(){
		super.display();
		System.out.println("Weekly bonus is : " + this.getWeeklyBonus());
	}

 }