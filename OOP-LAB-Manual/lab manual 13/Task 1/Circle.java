class Circle extends Shape{

	private double x;
	private double y;
	private double radius;

	Circle(){
		super();
		setX(0);
		setY(0);
		setRadius(0);
	}

	Circle(double x , double y , double radius , String color){
		super(color);
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
	}

	void setX(double x){
		this.x = x;
	}

	void setY(double y){
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

	void draw(){
		System.out.println("Color is : " + super.getColor());
		System.out.println("X is : " + getX());
		System.out.println("Y is : " + getY());
		System.out.println("Radius is : " + getRadius());

	}

	double calculateArea(){
		return 3.14*radius*radius;
	}

	double calculatePerimeter(){
		return 2*3.14*radius;
	}
 }	