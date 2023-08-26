//ham super keyword k through direct parent class ka method b call kr sakty han 
class Super02{
	void m1()
	{
	System.out.println("\n\t To call parent class method");
	}
}
class B extends Super02{
	void show()
	{
	super.m1();
	}
	public static void main(String[] args){
		B object = new B();
		object.show();
	}
}