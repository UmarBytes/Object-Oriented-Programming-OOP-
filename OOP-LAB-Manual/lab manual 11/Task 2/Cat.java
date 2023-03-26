public class Cat extends Pet{

	private String furColor;
	private String whiskerColor;
	private double furLength;
	private int toeNumber;

  	Cat(){

		furColor = "null";
		whiskerColor = "null";
		furLength = 0.0;
		toeNumber = 0;
  }

  	Cat(String furColor , String whiskerColor , double furLength , int toeNumber){
		this.furColor = furColor;
		this.whiskerColor = whiskerColor;
		this.furLength = furLength;
		this.toeNumber = toeNumber;
  }

  	Cat(String furColor , String whiskerColor , double furLength , int toeNumber , String eyeColor , double age , double weight , String location){

		super(eyeColor , age , weight , location);
		this.furColor = furColor;
		this.whiskerColor = whiskerColor;
		this.furLength = furLength;
		this.toeNumber = toeNumber;
  }

  	void setFurColor(String furColor){
		this.furColor = furColor;
  }

  	void setWhiskerColor(String whiskerColor){
		this.whiskerColor = whiskerColor;
  }

  	void setFurLength(double furLength){
		this.furLength = furLength;
  }

  	void setToeNumber(int toeNumber){
		this.toeNumber = toeNumber;
  }

  	String getFurColor(){
		return furColor;
  }

  	String getWhiskerColor(){
		return whiskerColor;
  }

  	double getFurLength(){
		return furLength;
  }

  	int getToeNumber(){
		return toeNumber;
  }

  	@Override
  	void display(){

		super.display();
		System.out.println("Fur Color : " + getFurColor());
		System.out.println("Whisker Color : " + getWhiskerColor());
		System.out.println("Fur Length : " + getFurLength());
		System.out.println("Toe Number : " + getToeNumber());
  }

  	void purr(int soundLevel){
		System.out.println("\nSound Level : " + soundLevel);
  }

  	void meow(){
		System.out.println("Cat is meowing.");
  }

  	@Override
  	void eat(String feedType){
		super.eat(feedType);
  }
}