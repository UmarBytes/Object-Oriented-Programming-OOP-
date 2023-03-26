public class RunCar{
	public static void main(String[] args){
		
		Car car1 = new Car();
		Car car2 = new Car(2016, "BMW", 450);
		Car car3 = new Car(2019, "corolla", 300);

		car2.setYearModel(2017);
		car2.setMake("Honda");
		car2.setSpeed(600);

		car3.setYearModel(2020);
		car3.setMake("Mercedes");
		car3.setSpeed(400);

		
		System.out.println("Displaying the details of Car1 :");
		car1.display();

		System.out.println("\nDisplaying the details of Car3 :");
		car2.display();
		System.out.println("\nDisplaying the details of Car3 :");
		car3.display();

		
		car2.copy(car3);

		System.out.println("Calling toString() method of Car3 :");
		System.out.println(car3.toString());


		if(car2.compare(car3)){
			System.out.println("Car2 and Car3 are equal.");
		}
		else{
			System.out.println("Car2 and Car3 are not equal.");
		}


		System.out.println("\nAccelerating Car1 five times :");
		car1.accelerate();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1 : " + car1.getSpeed());								
		
		System.out.println("\nApplying brake on Car1 five times :");
		car1.brake();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1 : " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1 : " + car1.getSpeed());

		System.out.println("\nAccelerating Car2 five times :");
		car2.accelerate();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2 : " + car2.getSpeed());								
		
		System.out.println("\nApplying brake on Car2 five times :");
		car2.brake();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2 : " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2 : " + car2.getSpeed());

		if (car1.isNotEqual(car3)){
			System.out.println("Car #1 and Car #3 are not equal.");
		}
		else{
			System.out.println("Car #1 and Car #3 are equal.");
		}

		Car anotherCar = car1.create(car3);
		System.out.println("\nDisplaying the details of newly created Car:");
		anotherCar.display();
		
	}
}