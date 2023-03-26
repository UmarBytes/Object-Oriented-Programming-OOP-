public class Rectangle extends Square{

	private double width;

 	Rectangle(){
		width = 0.0;
  }

 	Rectangle(double length , double width , String color){
		super(length , color);
		this.width = width;
  }

  	void setWidth(double width){
		this.width = width;
  }

  	double getWidth(){
		return width;
  }

 	@Override
  	void draw(){

		System.out.println("\nColor is : " + getColor());
		System.out.println("Rectangle Length : " + getLength());
		System.out.println("Rectangle Width : " + getWidth());
  }

  	@Override
  	double calculateArea(){
		return getLength()*width;
  }
  	@Override
  	double calculatePerimeter(){
		return 2*(getLength()*width);
  }
}