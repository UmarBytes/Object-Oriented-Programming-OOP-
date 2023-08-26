class RunTimeException{
	void show() throws RuntimeException
	{
		System.out.println("1");
		
	}
}
class Xyz{
		//same Exception b exicute ho gi or arithmatic b
	void show()throws ArithmeticException
	{
		System.out.println("2");
	
	}
           public static void main(String[] args){
 	RunTimeException obj = new RunTimeException();
	            obj.show();
	Xyz obj1 = new Xyz();
	           obj1.show();
          }
}