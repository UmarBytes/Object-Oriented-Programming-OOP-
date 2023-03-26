class Rectangle extends Square{

	private double width;

	Rectangle(){
		super();
		setWidth(0);
	}

	Rectangle(double length , double width , String color){

		super(length , color);
		setWidth(width);
	}

	void setWidth(double width){
		this.width = width;
	}

	double getWidth(){
		return width;
	}

	void draw(){
		System.out.println("Color is : " + super.getColor());
		System.out.println("Length is : " + super.getLength());
		System.out.println("Width is : " + getWidth());
	}

	double calculateArea(){
		return getLength()*width;
	}

	double calculatePerimeter(){
		return 2*(getLength()+width);
	}
 }