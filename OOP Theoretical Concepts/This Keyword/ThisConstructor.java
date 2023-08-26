class Test{
	//making  constructor
	Test(ThisConstructor td)
	{
	System.out.println("Make a counstructor in test class");
	}
}
class ThisConstructor{
	void show()
	{
	Test t = new Test(this);
	}
        public static void main(String[] args){
	ThisConstructor t = new ThisConstructor();
		t.show();
    }
}