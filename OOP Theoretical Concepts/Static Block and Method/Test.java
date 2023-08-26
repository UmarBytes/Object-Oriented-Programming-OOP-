           //here we are useing static method 
 //we need not to make object when we are useing static method
	//we can call method directly
	// we can make static method in any class and the call directly with class name
	
class Test{
          public static void main(String[] wali){
             Test.show();
       	Xyz.display();       
      }
	static void show()
	{
		System.out.println("My Name is Wali Sultan");
	}
}
class Xyz{
	static void display()
	{
		System.out.println("My Name is Umar Farooq Gujar");		
	}      
}