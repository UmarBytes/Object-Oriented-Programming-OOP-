public class Pet{

	private String name;
	private String animal;
	private int age;

  	Pet(){

	setName("null");
	setAnimal("null");
	setAge(0);
  }

 	 Pet(String n , String a , int ag){
		setName(n);
		setAnimal(a);
		setAge(ag);
  }

 	 void setName(String n){
		name = n;
  }

  	void setAnimal(String a){
		animal = a;
  }

  	void setAge(int ag){
		age = ag;
  }

 	 String getName(){
		return name;
  }

  	String getAnimal(){
		return animal;
  }

  	int getAge(){
		return age;
  }

 	 void display(){
		System.out.println("\nName : " + getName());
		System.out.println("Animal : " + getAnimal());
		System.out.println("Age : " + getAge());
  }

  	void copy(Pet p){
		p.setName(this.getName());
		p.setAnimal(this.getAnimal());
		p.setAge(this.getAge());
  }

  	public String toString(){
		String how = "\"" + getName() + ", " + getAnimal() + " , " + getAge() + "\"";
		return how;
  }

  	boolean compare(Pet p){
		if((p.getName()).equals(name) && (p.getAnimal()).equals(animal) && (p.getAge())==(age))
			return true;
	return false;
  }
}