public class RunEmployee{
  public static void main(String[] args){
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();

	e1.setName("M Ali");
	e1.setIdNumber(47899);
	e1.setDepartment("Accounting");
	e1.setPosition("Vice President");

	e2.setName("Baber Jameel");
	e2.setIdNumber(39119);
	e2.setDepartment("IT");
	e2.setPosition("Programmer");

	e3.setName("Rida Naeem");
	e3.setIdNumber(81774);
	e3.setDepartment("Manufacturing");
	e3.setPosition("Engineer");

		System.out.println("\nName: " + e1.getName());
		System.out.println("IdNumber: " + e1.getIdNumber());
		System.out.println("Department: " + e1.getDepartment());
		System.out.println("Position: " + e1.getPosition());

		System.out.println("\nName: " + e2.getName());
		System.out.println("IdNumber: " + e2.getIdNumber());
		System.out.println("Department: " + e2.getDepartment());
		System.out.println("Position: " + e2.getPosition());

		System.out.println("\nName: " + e3.getName());
		System.out.println("IdNumber: " + e3.getIdNumber());
		System.out.println("Department: " + e3.getDepartment());
		System.out.println("Position: " + e3.getPosition());
  }
}//class