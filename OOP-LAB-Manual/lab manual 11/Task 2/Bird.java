public class Bird extends Pet{

	private String featherColor;
	private double wingSpan;
	private String beakType;
	private boolean canFly;

  	Bird(){
		featherColor = "null";
		wingSpan = 0.0;
		beakType = "null";
		canFly = false;
  }

  	Bird(String featherColor , double wingSpan , String beakType , boolean canFly){

		this.featherColor = featherColor;
		this.wingSpan = wingSpan;
		this.beakType = beakType;
		this.canFly = canFly;
  }

  	Bird(String featherColor , double wingSpan , String beakType , boolean canFly , String eyeColor , double age , double weight , String location){

		super(eyeColor , age , weight , location);
		this.featherColor = featherColor;
		this.wingSpan = wingSpan;
		this.beakType = beakType;
		this.canFly = canFly;
  }

  	void setFeatherColor(String featherColor){
		this.featherColor = featherColor;
  }

  	void setWingSpan(double wingSpan){
		this.wingSpan = wingSpan;
  }

  	void setBeakType(String beakType){
		this.beakType = beakType;
  }

  	void setCanFly(boolean canFly){
		this.canFly = canFly;
  }

  	String getFeatherColor(){
		return featherColor;
  }

  	double getWingSpan(){
		return wingSpan;
  }

  	String getBeakType(){
		return beakType;
  }

  	boolean getCanFly(){
		return canFly;
  }

  	@Override
  	void display(){

		super.display();
		System.out.println("Feather Color : " + getFeatherColor());
		System.out.println("Wing Span : " + getWingSpan());
		System.out.println("Beak Type : " + getBeakType());
		System.out.println("Can Fly : " + getCanFly());
  }

  	void squawk(){
		System.out.println("\nBird is Squawking.");
  }

  	void fly(){
		System.out.println("Bird is Flying.");
  }

  	@Override
  	void eat(String foodType){
		super.eat(foodType);
  }
}