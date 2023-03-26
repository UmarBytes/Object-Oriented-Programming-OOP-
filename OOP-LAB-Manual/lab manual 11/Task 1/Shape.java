public class Shape{

	private String color;

  	Shape(){
		color = "null";
  }

  	Shape(String color){
		this.color = color;
  }

  	void setColor(String color){
		this.color = color;
  }

  	String getColor(){
		return color;
  }

  	void draw(){
		System.out.println("\nColor is : " + getColor());
  }

  	double calculateArea(){
		return 0;
  }

  	double calculatePerimeter(){
		return 0;
  }
}