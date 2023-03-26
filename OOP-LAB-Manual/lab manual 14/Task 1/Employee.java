class Employee{

	private String name;
	private int ID;

	public Employee(){
		this.setName("Bilal");
		this.setID(88);
	}

	public Employee(String name , int ID){
		this.setName(name);
		this.setID(ID);
	}

	public void setName(String name){
		this.name = name;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public String getName(){
		return this.name;
	}

	public int getID(){
		return this.ID;
	}

	public double weeklyPay(){
		return 0.0;
	}

	public void display(){
		System.out.println("Name is : " + this.getName() + "\nID is : " + this.getID());
	}

	public static void display(Employee[] employees){

		for (int i = 0 ; i < employees.length ; i++) {

			employees[i].display();
			System.out.println("Weekly pay is : " + employees[i].weeklyPay());
		}
	}
 }