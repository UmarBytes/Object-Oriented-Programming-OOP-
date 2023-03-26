abstract class Shape{

	private String color;

	Shape(){
		color = null;
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

	abstract void draw();
	abstract double calculateArea();
	abstract double calculatePerimeter();
 }