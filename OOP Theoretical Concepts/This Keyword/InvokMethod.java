class ThisInvokMethod{
	void display()
	{
            System.out.println("compiler atomaticly add this keyword in Invok method ");
	}
	void show()
	{
		this.display();
	}
		public static void main(String[] args){
		ThisInvokMethod in  = new ThisInvokMethod();
			in.show();		
	}
}