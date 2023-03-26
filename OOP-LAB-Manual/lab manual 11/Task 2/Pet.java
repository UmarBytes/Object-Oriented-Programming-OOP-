public class Pet{

	private String eyeColor;
	private double age;
	private double weight;
	private String location;

  	Pet(){
		eyeColor = "null";
		age = 0.0;
		weight = 0.0;
		location = "null";
  }

  	Pet(String eyeColor , double age , double weight , String location){
		this.eyeColor = eyeColor;
		this.age = age;
		this.weight = weight;
		this.location = location;
  }

  	void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
  }

  	void setAge(double age){
		this.age = age;
  }

  	void setWeight(double weight){
		this.weight = weight;
  }

  	void setLocation(String location){
		this.location = location;
  }

  	String getEyeColor(){
		return eyeColor;
  }

  	double getAge(){
		return age;
  }

  	double getWeight(){
		return weight;
  }

  	String getLocation(){
		return location;
  }

  	void display(){

		System.out.println("\nEye color : " + getEyeColor());
		System.out.println("Age : " + getAge());
		System.out.println("Weight : " + getWeight());
		System.out.println("Location : " + getLocation());
  }

  	void eat(String foodType){
		System.out.println("Eat : " + foodType);
  }

  	void sleep(double timeLength){
		System.out.println("Sleep time length : " + timeLength);
  }
}