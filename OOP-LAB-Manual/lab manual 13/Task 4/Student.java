public class Student implements Comparable{

	private int ID;
	private String name;

	Student(int ID , String n){
		this.ID = ID;
		name = n;
	}
	public void setID(int ID){
		this.ID = ID;
	}

	public void setName(String n){
		name = n;
	}

	public int getID(){
		return ID;
	}

	public String getName(){
		return name;
	}

	public void displayState(){

		System.out.println("Name is :" + getName() + "\nId is :"+ getID());			
	}
	public int compareTo(Object abc){
		Student s1 =  (Student) abc;

		if(this.name.compareTo(s1.name) > 0){
					return 1;
	}
		else if(this.name.compareTo(s1.name) < 0){
					return -1; 
	} 
		else{
			return 0;
		}
	}
 }