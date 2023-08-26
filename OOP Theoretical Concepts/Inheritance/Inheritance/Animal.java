/*
	Simple Inheritance

	The relation between two classes (IS-A) relation
	*we can say the stronge association between clesses*
	we can write like this
			Dog IS-A Animal
	*Dog is Child class        *Animal is perent class
	#we use **extends**keyword in inhertitance
*/
class Animal{
	void berking(){
		String result;
		System.out.println("Dog is Barking.....");
	
	}
	void eating(){
		System.out.println("Dog is eating.......");
	}
	
}
class Dog extends Animal{
	public static void main(String[] args) {
	
		Dog d = new Dog();
			d.berking();
			d.eating();
	
	}//mian
}//class