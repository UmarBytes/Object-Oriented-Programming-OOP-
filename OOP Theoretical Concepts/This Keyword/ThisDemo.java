class ThisDemo{
	ThisDemo()
	{
           System.out.println("No argument comstractor");
	}
	ThisDemo(int a)
	{
	this();
          System.out.println("Parametrised constractor");
	}
	public static void main(String[] args){
		ThisDemo d = new ThisDemo(101);
			
         
	}
}