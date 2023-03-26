class Employee{

	private String name;
	private int idNumber;
	private String department;
	private String position;

	Employee(){

		this.setName("Iqra");
		this.setIdNumber(242);
		this.setDepartment("CS");
		this.setPosition("It Manager");
	}

	Employee(String n , int id , String d , String p){
		this.setName(n);
		this.setIdNumber(id);
		this.setDepartment(d);
		this.setPosition(p);
	}

	public void setName(String n){
		name = n;
	}

	public void setIdNumber(int id){
		idNumber = id;
	}

	public void setDepartment(String d){
		department = d;
	}

	public void setPosition(String p){
		position = p;
	}

	public String getName(){
		return name;
	}

	public int getIdNumber(){
		return idNumber;
	}

	public String getDepartment(){
		return department;
	}

	public String getPosition(){
		return position;
	}

	void display(){

		System.out.println("Name : " + getName());
		System.out.println("Id number : " + getIdNumber());
		System.out.println("Department : " + getDepartment());
		System.out.println("Position : " + getPosition());
	}

	void copy(Employee e){

		e.setName(this.getName());
		e.setIdNumber(this.getIdNumber());
		e.setDepartment(this.getDepartment());
		e.setPosition(this.getPosition());
	}

	public String toString(){
		return this.getName() + ", " + this.getIdNumber() + ", " + this.getDepartment() + ", " + this.getPosition();
	}

	boolean compare(Employee e){

		return this.getName().equals(e.getName()) &&
			this.getIdNumber() == e.getIdNumber() &&
			this.getDepartment().equals(e.getDepartment()) &&
			this.getPosition().equals(e.getPosition());
	}

	boolean isNotEqual(Employee e){
		return !this.compare(e);
	}

	Employee create(Employee e){
		return new Employee(this.getName() + " " + e.getName(),
				this.getIdNumber() + e.getIdNumber(),
				this.getDepartment() + " " + e.getDepartment(),
				this.getPosition() + " " + e.getPosition());
	}
	
}