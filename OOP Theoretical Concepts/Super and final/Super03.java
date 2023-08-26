class Super03{
	Super03()
	{
	System.out.println("\tHi! i am in class A");
	}
}
class B extends Super03{
	B()
	{
	super();
	System.out.println("\tHi! i am in class B");
	}
	public static void main(String[] args){
		B object = new B();
	}//main
}