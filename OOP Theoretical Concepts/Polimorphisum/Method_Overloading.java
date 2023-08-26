/* Conditions for method overloading
	- 1 same name
	- 2 same class
	- 3 Diffrent arguments in method
		# in me say koi ayk condition b setisfied ho jaye to method overloading kehlaye ga
		* No.Of.arguments
		* Sequesnce. of. arguments
		* ( Data )type .of. arguments
*/
public class Method_Overloading{
	public static void main(String[] args) {
		//Method
		Method_Overloading Obj = new Method_Overloading();
		Obj.show(10);
			
				//Ham is method me Jis data type ki velue put kareen gy 
				usi data type ka Method call ho ga
	}

		void show(int a)
		{
			System.out.println("Method for integer type value");
		}//method

		//same name another method
		void show(String name)
		{
			System.out.println("Method for string type value");
		}//method
}//class