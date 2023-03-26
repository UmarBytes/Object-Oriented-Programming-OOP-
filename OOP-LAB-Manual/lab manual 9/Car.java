public class Car{

	private int yearModel;
	private String make;
	private int speed;

	Car(){
		this.setYearModel(225);
		this.setMake("Audi");
		this.setSpeed(350);
	}

	Car(int y, String m, int s){
		this.setYearModel(y);
		this.setMake(m);
		this.setSpeed(s);
	}

	public void setYearModel(int model){
		yearModel = model;
	}

	public void setMake(String m){
		make = m;
	}

	public void setSpeed(int s){
		speed = s;
	}

	public int getYearModel(){
		return yearModel;
	}	

	public String getMake(){
		return make;
	}

	public int getSpeed(){
		return speed;
	}

	public void accelerate(){
		setSpeed(getSpeed() + 5);
	}

	public void brake(){
		setSpeed(getSpeed() - 5);
	}

	void display(){
		System.out.println("Year model: " + getYearModel());
		System.out.println("Make: " + getMake());
		System.out.println("Speed: " + getSpeed());
	}

	void copy(Car c){
		c.setYearModel(this.getYearModel());
		c.setMake(this.getMake());
		c.setSpeed(this.getSpeed());
	}

	public String toString(){
		return this.getYearModel() + ", " + this.getMake() + ", " + this.getSpeed();
	}

	boolean compare(Car c){
		return this.getYearModel() == c.getYearModel() &&
				this.getMake().equals(c.getMake()) &&
				this.getSpeed() == c.getSpeed();
	}

	boolean isNotEqual(Car c){
		return !this.compare(c);
	}

	Car create(Car c){
		return new Car(this.getYearModel() + c.getYearModel(),
							this.getMake() + " " + c.getMake(),
							this.getSpeed() + c.getSpeed());
	}

}