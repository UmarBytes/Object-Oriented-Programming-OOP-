public class Engine{

	private int engineSize;
	private String engineType;
	private boolean engineRunning;
	private int topSpeed;

  	Engine(){

		engineSize = topSpeed = 0;
		engineType = "null";
		engineRunning = false;
  }

  	Engine(int engineSize , String engineType , boolean engineRunning , int topSpeed){
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.engineRunning = engineRunning;
		this.topSpeed = topSpeed;
  }

  	Engine(Engine e){
		this.engineSize = e.engineSize;
		this.engineType = e.engineType;
		this.engineRunning = e.engineRunning;
		this.topSpeed = e.topSpeed;
  }

  	void setEngineSize(int engineSize){ this.engineSize = engineSize; }
  	void setEngineType(String engineType){ this.engineType = engineType; }
	void setEngineRunning(boolean engineRunning){ this.engineRunning = engineRunning; }
  	void setTopSpeed(int topSpeed){ this.topSpeed = topSpeed; }

  	int getEngineSize(){ return engineSize; }
  	String getEngineType(){ return engineType; }
	boolean getEngineRunning(){ return engineRunning; }
  	int getTopSpeed(){ return topSpeed; }

  	boolean startEngine(){
		engineRunning = true;
		return engineRunning;
  }

  	boolean stopEngine(){
		engineRunning = false;
		return engineRunning;
  }

  	boolean isEngineRunning(){
		return (engineRunning);
  }

  	void currentEngineState(){
		System.out.println("\nEngine Size : " + getEngineSize());
		System.out.println("Engine Type : " + getEngineType());
		System.out.println("Engine Running : " + getEngineRunning());
		System.out.println("Top Speed : " + getTopSpeed());
  }
}