public class Fish extends Pet{

	private boolean jawless;
	private boolean dorsalFin;
	private int swimSpeed;

  	Fish(){
		jawless = false;
		dorsalFin = false;
		swimSpeed = 0;
  }

  	Fish(boolean jawless , boolean dorsalFin , int swimSpeed){
		jawless = false;
		dorsalFin = false;
		swimSpeed = 0;
  }

  	Fish(boolean jawless , boolean dorsalFin , int swimSpeed , String eyeColor , double age , double weight , String location){

		super(eyeColor , age , weight , location);
		jawless = false;
		dorsalFin = false;
		swimSpeed = 0;
  }

  	void setJawless(boolean jawless){
		this.jawless = jawless;
  }

  	void setDorsalFin(boolean dorsalFin){
		this.dorsalFin = dorsalFin;
  }

  	void setSwimSpeed(int swimSpeed){
		this.swimSpeed = swimSpeed;
  }

  	boolean getJawless(){
		return jawless;
  }

  	boolean getDorsalFin(){
		return  dorsalFin;
  }

  	int getSwimSpeed(){
		return swimSpeed;
  }

 	@Override
  	void display(){

		super.display();
		System.out.println("Jawless : " + getJawless());
		System.out.println("Dorsal Fin : " + getDorsalFin());
		System.out.println("Swim Speed : " + getSwimSpeed());
  }

  	void swim(String direction){
		System.out.println("\nSwim Direction : " + direction);
  }

  	@Override
  	void eat(String feedType){
		super.eat(feedType);
  }
}
	