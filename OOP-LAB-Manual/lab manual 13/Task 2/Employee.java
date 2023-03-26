abstract class Employee{

	private String name;
	private int ID;

	Employee(){
		name = null;
		ID = 0;
	}

	Employee(String name , int ID){
		this.name = name;
		this.ID = ID;
	}

	void setName(String name){
		this.name = name;
	}

	void setID(int ID){
		this.ID = ID;
	}

	String getName(){
		return name;
	}

	int getID(){
		return ID;
	}

	abstract double weeklyPay();
	abstract void display();
 }