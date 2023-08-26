class Method_Overriding{
	void show(String name, int a)
	{
		System.out.println("1");
	}
}
	class Xyz extends Method_Overriding{
	void show(String name, int a)
	{
		System.out.println("2");
	}
        public static void main(String[] args){
       	Method_Overriding obj = new Method_Overriding();
	obj.show("Allah",1);  
	Xyz obj1 = new Xyz();
	obj1.show("Muhamad", 1);  

       }
}