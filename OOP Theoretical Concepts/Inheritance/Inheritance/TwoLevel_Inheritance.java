/*
	we can write two classes on the single file 
	without using 'extends' kwyword
	and make the object to using ther class name 
*/
class TwoLevel_Inheritance{

	public static void main(String[] args) {
	System.out.println("Me......");
	
	TwoLevel_Inheritance umar = new TwoLevel_Inheritance();
	MyTeacher faheem = new MyTeacher();

		umar.name(); umar.reading(); umar.writing();  

		faheem.mentor();

	}//main
	public void name(){
		System.out.println("My name is Muhammd Umar Farooq.");
	}

	public void reading(){
		System.out.println("i am reading the book.....");
	}

	public void writing(){
		System.out.println("i am writing the code..... ");
	}

	

	}//class
	class MyTeacher{
		void mentor(){
		System.out.println("Doctor faheem is my mentore...");
	}//void method 
}//class

