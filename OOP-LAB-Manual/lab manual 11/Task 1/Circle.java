public class Circle extends Shape{

	private double x;
	private double y;
	private double radius;

  	Circle(){
		x = y = radius = 0.0;
  }

 	Circle(double x , double y , String color , double radius){

		this.x = x;
		this.y = y;
		setColor(color);
  		this.radius = radius;
  }

  	void setX(double x){
		this.x = x;
  }

  	void setY(double x){
		this.y = y;
  }

  	void setRadius(double radius){
		this.radius = radius;
  }

  	double getX(){
		return x;
  }

  	double getY(){
		return y;
  }

  	double getRadius(){
		return radius;
  }

  	@Override
	void draw(){

		System.out.println("\nCircle X : " + getX());
		System.out.println("Circle Y : " + getY());
		System.out.println("Circle color : " + getColor());
		System.out.println("Circle Radius : " + getRadius());
  }

  	@Override
  	double calculateArea(){
		return 3.14*radius*radius;
  }

 	 @Override
  	double calculatePerimeter(){
	return 2*3.14*radius;
  }
}