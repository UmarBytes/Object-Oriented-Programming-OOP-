class Employ{
	String name;
	int emp_id;
	Employ(String name, int emp_id){
		this.name = name;
		this.emp_id = emp_id;
	}//counsturstor
      public static void main(String[] args){
	Employ e1 = new Employ("Umar" , 7);
	Employ e2 = new Employ("Hussnain" , 6);

           System.out.println(e1.name+"   "+e1.emp_id);
           System.out.println(e2.name+"   "+e2.emp_id);

	}
}