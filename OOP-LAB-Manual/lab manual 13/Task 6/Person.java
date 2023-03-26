public class Person{

	private String name;
	private int age;

	Person(){
		name = null;
		age = 0;
	}

	Person(String n , int a){
		name = n;
		age = a;
	}

	void setName(String n){
		name = n;
	}

	void setAge(int a){
		age = a;
	}

	String getName(){
		return name;
	}

	int getAge(){
		return age;
	}
 }