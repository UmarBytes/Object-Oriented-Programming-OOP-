public class UsingPets{
  public static void main(String[] args){

	Bird b = new Bird();
	Bird b1 = new Bird("Blue" , 6.2 , "Fruit and nut-eater" , true , "Black" , 4 , 3 , "Sargodha");

	Cat c = new Cat();
	Cat c1 = new Cat("White" , "White" , 5.5 , 19 , "Grey" , 10 , 7 , "Lahore");

	Fish f = new Fish();
	Fish f1 = new Fish(true , true , 300 , "Orange" , 20 , 1.5 , "Karachi");

	System.out.println("\n...Bird...");
	b.display();
	b1.display();

	System.out.println("\n...Cat...");
	c.display();
	c1.display();

	System.out.println("\n...Fish...");
	f.display();
	f1.display();

	b.setEyeColor("Brown");
	b.setAge(10);
	b.setWeight(5);
	b.setLocation("xyz");
	b.setFeatherColor("Black");
	b.setWingSpan(2.5);
	b.setBeakType("Meat-Eater");
	b.setCanFly(true);

	c.setEyeColor("Blue");
	c.setAge(11);
	c.setWeight(3.5);
	c.setLocation("mno");
	c.setFurColor("Black");
	c.setWhiskerColor("White");
	c.setFurLength(1.8);
	c.setToeNumber(20);

	f.setEyeColor("Black");
	f.setAge(15);
	f.setWeight(4);
	f.setLocation("abc");
	f.setJawless(true);
	f.setDorsalFin(false);
	f.setSwimSpeed(300);

	System.out.println("\n...After Changing State...");
	b.display();
	c.display();
	f.display();

	b.squawk();
	b.fly();
	b.eat("Sunflower");

	c.purr(10);
	c.meow();
	c.eat("Meat or Fish meal");

	f.swim("left");
	f.eat("Bloodworms");
  }
}