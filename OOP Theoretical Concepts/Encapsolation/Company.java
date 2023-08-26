class Employee{
	private int emp_id;     //veriable
          public void setEmpid(int eid)         //method
	{
	   emp_id = eid;                 //Assign set value to employee id
	}
	public int getEmpid()         //set get method
	{
	    return emp_id;          //return employee ID 
	}
}                     //untill this line called encapsulation 

		//we will save and compile which class who have main method 
class Company{
	public static void main(String[] args){
		Employee e = new Employee();           // creat Objetc 
		      e.setEmpid(101);	          //call Object
     		System.out.println("Employee ID is : "+e.getEmpid());      //to get output call Metod (getEmpid) 
	}
}