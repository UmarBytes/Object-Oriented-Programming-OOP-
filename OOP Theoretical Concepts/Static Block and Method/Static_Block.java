/*
static method exicute automaticly 
there is no need to creat object method 
******we can creat multiple static method in a class******
   #static blocks exicutes Top to botam and last Main Method
*/
class Static_Block
{
	static
	        {
	        	System.out.println("Static block : 01");
	        }
	static
	         {
		System.out.println("Static block : 02");
	         }
	public static void main(String[] args){
		System.out.println("I am in main Method");	
	}
}