class Car{

	private int yearModel;
	private String make;
	private int speed;

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

}