class Super_Keyword{
	int a = 10;
}
class B extends Super_Keyword{
	int a = 20;
	void show(int a){
	//it,s print parameter of object
	System.out.println(a);
	//this print crunt class instance veriable
	 System.out.println(this.a);
	//super print parents class instance varibale
	System.out.println(super.a);
	}
	
	public static void main(String[] args){
		B object = new B();
		object.show(30);
	}//main
      }//B
