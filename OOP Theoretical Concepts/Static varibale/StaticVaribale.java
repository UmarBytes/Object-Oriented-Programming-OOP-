class StaticVaribale
{
	int empid;
	String name;
       //static variable
	static String company = "Wali";
	      //constractor
 	     StaticVaribale(int empid, String name)
		{
		this.empid = empid;
		this.name = name;
		}     
	void display()
	{
	System.out.println("\n\t\t"+empid+"   "+name+"   "+company);
	}
          public static void main(String[] args){
	StaticVaribale met = new StaticVaribale(101,"Umar sultan");
	met.display();
	
	StaticVaribale met02 = new StaticVaribale(101,"Zaid sultan");
	met02.display();
	
	StaticVaribale met03 = new StaticVaribale(101,"Buali sultan");
	met03.display();
       }
}