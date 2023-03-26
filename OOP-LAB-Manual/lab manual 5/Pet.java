public class Pet{
	private String name;
	private String animal;
	private int age;
//-------------------------------
  void setName(String n){
	name = n;
  }
  void setAnimal(String a){
	animal = a;
  }
  void setAge(int ag){
	age = ag;
  }
//-------------------------------
  String getName(){
	return name;
  }
  String getAnimal(){
	return animal;
  }
  int getAge(){
	return age;
  }
}//class