// we can not extends "final" class

final class Final_Class{
	void m1()
	{
	System.out.println("I am in class one:");
	}

         public static void main(String[] args){
	Final_Class object = new Final_Class();
		object.m1();
    }
}