class SequenceofArguments{
	void Show(int a, String s)
	{
		System.out.println("1");
	}
	void show(String s, int a)
	{
		System.out.println("2");
	}
         public static void main(String[] args){
	SequenceofArguments Obj = new SequenceofArguments();
		Obj.show("name",10);	
      }//mian
}//class