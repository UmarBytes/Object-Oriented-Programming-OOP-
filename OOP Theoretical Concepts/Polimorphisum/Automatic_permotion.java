class Automatic_permotion{
	void show(int a)
	{
		System.out.println("Int method");
	}
	/*void show(String s)
	{
		System.out.println("String method");
	}*/
	// Varargs me ham Multiple arguments lay sakty han
	void show(int...a)
	{
		System.out.println("Varargs method");
	}
        public static void main(String[] args){
	Automatic_permotion Obj = new Automatic_permotion();
		//Obj.show(10);
		//Obj.show("XYZ");
		Obj.show(10,20,30,40,50,60);	      
       }
}//clas