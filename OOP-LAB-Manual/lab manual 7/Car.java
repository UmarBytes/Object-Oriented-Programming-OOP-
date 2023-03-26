public class Car{

	private int yearModel;
	private String make;
	private int speed;

  	Car(){
		setYearModel(0000);
		setMake("null");
		setSpeed(0);
  }

  	Car(int ym, String m, int s){
		setYearModel(ym);
		setMake(m);
		setSpeed(s);
  }

  	void setYearModel(int YM){
		yearModel = YM;
  }
  	void setMake(String m){
		make = m;
  }
 	 void setSpeed(int s){
		speed = s;
  }

  	int getYearModel(){
		return yearModel;
  }
  	String getMake(){
		return make;
  }

  	int getSpeed(){
		return speed;
  }

  	void display(){
		System.out.println("\nYear Model: " + getYearModel());
		System.out.println("Make: " + getMake());
		System.out.println("Speed: " + getSpeed());
  }

  	void copy(Car c){
		c.setYearModel(this.yearModel);
		c.setMake(this.make);
		c.setSpeed(this.speed);
  }

  	boolean compare(Car c){
		return (c.getYearModel()==(this.yearModel) && c.getMake().equals(this.make) && c.getSpeed()==(this.speed));
  }

  	public String toString(){
		String how = "\"" + getYearModel() + ", " + getMake() + ", " + getSpeed() + "\"";
		return how;
  }

  	void accelerate(){
		speed += 5;
  }

  	void brake(){
		speed -= 5;
  }
}