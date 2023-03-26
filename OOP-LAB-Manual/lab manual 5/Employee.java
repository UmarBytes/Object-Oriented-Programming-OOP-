public class Employee{
	private String name;
	private int idNumber;
	private String department;
	private String position;
//--------------------------------------------------------------------
  void setName(String n){
	name = n;
  }
  void setIdNumber(int id){
	idNumber = id;
  }
  void setDepartment(String d){
	department = d;
  }
  void setPosition(String pos){
	position = pos;
  }
//--------------------------------------------------------------------
  String getName(){
	return name;
  }
  int getIdNumber(){
	return idNumber;
  }
  String getDepartment(){
	return department;
  }
  String getPosition(){
	return position;
  }
}//class