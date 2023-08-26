/*single inheritance
	Simple Inheritance
	**inheritance
	The relation between two classes is (IS-A) relation
	we can write like this
			Dog IS-A Animal
	*Dog is Child class        *Animal is perent class
	#we use **ectends**keyword in inhertitance
*/
class Simple_Inheritance_Animal{
	void eat(){
		System.out.println("Dog is eating");
	}//void mathod
}//parent class 

class Dog extends Simple_Inheritance_Animal{
	public static void main(String[] args){
	Dog d = new Dog();
	d.eat();
	}//mian
}//dog class