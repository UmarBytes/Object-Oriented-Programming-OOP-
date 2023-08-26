/*#Hirarical inheritance
	*we will compile parent class name but will run that clas who have 
	   main mathod.
		**#ham kisi b mathod ko kisi b class k sath extends krwa sakty han or call kr sakty han
*/
class Hierarchical{
	void nameHierarchical(){
		System.out.println("Mathod of class Number 01");
	}//mathod
	
}//A class
class B extends Hierarchical{
	void nameB(){
		System.out.println("Mathod of class Number 02");
	}//mathod
	
}//class b
class C extends Hierarchical{
		void nameC(){
	System.out.println("Mathod of class Number 03");
	}//mathod

	public static void main(String[] args){

	Hierarchical object1 = new Hierarchical();
	object1.nameHierarchical();
	System.out.println("------------------------------------------------------");

	B object2 = new B();
	object2.nameHierarchical();
	object2.nameB();
	System.out.println("------------------------------------------------------");

	C object3 = new C();
	object3.nameHierarchical();
	//object3.nameB();
	object3.nameC();
	
      }//main
}//class c