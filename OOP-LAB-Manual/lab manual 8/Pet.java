class Pet{

	private String name;
	private String animal;
	private int age;

	Pet(){
		setName("Jack");
		setAnimal("Dog");
		setAge(7);
	}

	Pet(String n , String a , int ag){
		setName(n);
		setAnimal(a);
		setAge(ag);
	}

	public void setName(String n){
		name = n;
	}

	public void setAnimal(String a){
		animal = a;
	}

	public void setAge(int ag){
		age = ag;
	}

	public String getName(){
		return name;
	}

	public String getAnimal(){
		return animal;
	}

	public int getAge(){
		return age;
	}

	void display(){

		System.out.println("Name = " + getName());
		System.out.println("Animal = " + getAnimal());
		System.out.println("Age = " + getAge());
	}

	void copy(Pet p){

		p.setName(this.getName());
		p.setAnimal(this.getAnimal());
		p.setAge(this.getAge());
	}

	public String toString(){
		return this.getName() + ", " + this.getAnimal() + ", " + this.getAge();
	}

	boolean compare(Pet p){
		return (this.getName().equals(p.getName()) &&
				this.getAnimal().equals(p.getAnimal()) &&
				this.getAge() == p.getAge());
	}

	boolean isNotEqual(Pet p){
		return !this.compare(p);
	}

	Pet create(Pet p){
		return new Pet(this.getName() + " " + p.getName(),
				this.getAnimal() + " " + p.getAnimal(),
				this.getAge() + p.getAge());
	}

}