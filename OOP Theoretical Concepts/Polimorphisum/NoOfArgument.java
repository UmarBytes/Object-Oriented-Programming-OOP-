class NoOfArgument{
	void Show(int a, int b)
	{
		System.out.println("1");
	}
	void show(int a)
	{
		System.out.println("2");
	}
         public static void main(String[] args){
	NoOfArgument Obj = new NoOfArgument();
		Obj.show(10);	
      }//mian
}//class