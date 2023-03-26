class Square extends Shape{

	private double length;

	Square(){
		super();
		setLength(0);
	}

	Square(double length , String color){
		super(color);
		this.setLength(length);	
	}

	void setLength(double length){
		this.length = length;
	}

	double getLength(){
		return length;
	}

	void draw(){
		System.out.println("Color is : " + super.getColor());
		System.out.println("Length is : " + getLength());
	}

	double calculateArea(){
		return length*length;
	}

	double calculatePerimeter(){
		return 4*length;
	}
 }