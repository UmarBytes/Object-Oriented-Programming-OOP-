/*#Multilevel inheritance
	*we will compile parent class name but will run that clas who have 
	   main mathod.
*/
class Multilevel{
	void nameMultilevel(){
		System.out.println("Mathod of class A");
	}//mathod
	
}//A class
class B extends Multilevel{
	void nameB(){
		System.out.println("Mathod of class B");
	}//mathod
	
}//class b
class C extends B{
		void nameC(){
	System.out.println("Mathod of class C");
	}//mathod
	public static void main(String[] args){
	Multilevel object1 = new Multilevel();
	object1.nameMultilevel();
	System.out.println("------------------------------------------------------");
	B object2 = new B();
	object2.nameMultilevel();
	object2.nameB();
	System.out.println("------------------------------------------------------");
	C object3 = new C();
	object3.nameMultilevel();
	object3.nameB();
	object3.nameC();
	
          }//main
}//class c