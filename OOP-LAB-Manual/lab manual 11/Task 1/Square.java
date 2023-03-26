public class Square extends Shape{

	private double length;

  	Square(){
		length = 0.0;
  }

  	Square(double length , String color){
		this.length = length;
		setColor(color);
  }

  	void setLength(double length){
		this.length = length;
  }

  	double getLength(){
		return length;
  }

  	@Override
  	void draw(){
		System.out.println("\nSquare Length : " + getLength());
		System.out.println("Square color : " + getColor());
  }

  	@Override
  	double calculateArea(){
		return length*length;
  }

  	@Override
  	double calculatePerimeter(){
		return 4*length;
  }
}