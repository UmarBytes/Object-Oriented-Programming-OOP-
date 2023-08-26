class Converiant{
	Object show()
	{
		System.out.println("1");
		return null;
	}
}
class Xyz{
	String show()
	{
		System.out.println("2");
		return null;
	}
           public static void main(String[] args){
 	Converiant obj = new Converiant();
	            obj.show();
	Xyz obj1 = new Xyz();
	           obj1.show();
          }
}