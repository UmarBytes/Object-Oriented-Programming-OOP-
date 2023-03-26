public class Employee{

	private String name;
	private int idNumber;
	private String department;
	private String position;

  	Employee(){
		setName("null");
		setIdNumber(0);
		setDepartment("null");
		setPosition("null");
  }

  	Employee(String n, int id, String d, String p){
		setName(n);
		setIdNumber(id);
		setDepartment(d);
		setPosition(p);
  }

  	void setName(String n){
		name = n;
  }

  	void setIdNumber(int id){
		idNumber = id;
  }

  	void setDepartment(String d){
		department = d;
  }

  	void setPosition(String pos){
		position = pos;
  }

  	String getName(){
		return name;
  }

  	int getIdNumber(){
		return idNumber;
  }

 	 String getDepartment(){
		return department;
  }

 	 String getPosition(){
		return position;
  }

 	 void display(){
		System.out.println("\nName: " + getName());
		System.out.println("IdNumber: " + getIdNumber());
		System.out.println("Department: " + getDepartment());
		System.out.println("Position: " + getPosition());
  }

 	 void copy(Employee e){
		e.setName(this.name);
		e.setIdNumber(this.idNumber);
		e.setDepartment(this.department);
		e.setPosition(this.position);
  }

  	public String toString(){
		String how = "\"" + getName() + ", " + getIdNumber() + " , " + getDepartment() + ", " + getPosition() + "\"";
		return how;
  }

 	 boolean compare(Employee e){
		return (e.getName().equals(this.name) && e.getIdNumber()==(this.idNumber) && e.getDepartment().equals(this.department) && e.getPosition().equals(this.position));
  }
}