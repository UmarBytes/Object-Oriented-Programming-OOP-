class Sallary{
	int salary;
	int getSalary(){
	    return salary;
	}
     public static void main(String args[]){
	Sallary s = new Sallary();
		s.salary = 10000;
	System.out.println(s.getSalary());
   }
}