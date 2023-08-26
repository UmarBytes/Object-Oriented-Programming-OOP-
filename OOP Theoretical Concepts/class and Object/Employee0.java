class Wali_Sultan{
	int earning;
	void Running(){
	     System.out.println("Wali Sultan Runnging Fast as like Hors ");
	}
	int getEarning(){
	     return earning;
	}
}
	
class Square{
	int sides;
	int area(){
	      return sides*sides;
	}
	int ParaMeters(){
	    return 4*sides;
	}
}

class Mobile{
	void Ringing(){
	System.out.println("The phone is Ringing......");
	}
	void Calling(){
	System.out.println("The phone is Calling......");
	}
	void Vibratinf(){
	System.out.println("The phone is Vibrating......");
	}
}

class Employee0{
	String name;
	int salary;
	public String getName(){
	    return name;
	}
	public int getSalary(){
	     return salary;
	}
	public void setName(String n){
	       name = n;
	}
        public static void main (String args[]){
          //#for Problem 01:
	Employee0 e1 = new Employee0();
	       e1.setName("Walisultan");
	       e1.salary = 1000;
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
	
         //#For Problem 02
	System.out.println("\n************************");
	Mobile e2 =new Mobile();
	     e2.Ringing();
	     e2.Calling();
	     e2.Vibratinf();

        //#For Problem 03
	System.out.println("\n************************");
	   Square e3 = new Square();
		e3.sides = 3;
		System.out.println(e3.area());
		System.out.println(e3.ParaMeters());

//#For Problem 04
	System.out.println("\n************************");
	     Wali_Sultan e4 = new Wali_Sultan();
		e4.earning = 7000;
	System.out.println(e4.getEarning());
		e4.Running();
    }
}
