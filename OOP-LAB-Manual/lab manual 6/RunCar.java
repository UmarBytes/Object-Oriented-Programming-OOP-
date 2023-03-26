public class RunCar{
	public static void main(String[] args){

		Car car = new Car();
		car.setYearModel(2018);
		car.setMake("BMW");
		car.setSpeed(60);

		car.accelerate();

		System.out.println("Speed of the car : " + car.getSpeed());
		car.accelerate();

		System.out.println("Speed of the car : " + car.getSpeed());
		car.accelerate();

		System.out.println("Speed of the car : " + car.getSpeed());
		car.accelerate();

		System.out.println("Speed of the car : " + car.getSpeed());
		car.accelerate();

		System.out.println("Speed of the car : " + car.getSpeed());								
		
		car.brake();

		System.out.println("Speed of the car: " + car.getSpeed());
		car.brake();

		System.out.println("Speed of the car: " + car.getSpeed());
		car.brake();

		System.out.println("Speed of the car: " + car.getSpeed());
		car.brake();

		System.out.println("Speed of the car: " + car.getSpeed());
		car.brake();

		System.out.println("Speed of the car: " + car.getSpeed());
		
	}
}