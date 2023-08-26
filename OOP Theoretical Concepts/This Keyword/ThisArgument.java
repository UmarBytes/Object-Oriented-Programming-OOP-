// we can use "this" keyword as argument
class ThisArgument{
	void Method1(ThisArgument td)
	{
  		System.out.println("I am in Method No : 01");
	}
	void Method2()
	{
	Method1(this);
	}
           public static void main(String[] args){
		ThisArgument td = new ThisArgument();
			td.Method2();		
     }
}