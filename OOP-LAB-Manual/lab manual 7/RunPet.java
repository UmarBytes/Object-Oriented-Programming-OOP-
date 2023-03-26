public class RunPet{
  public static void main(String[] args){

	Pet dog = new Pet("Jack" , "Dog" , 7);
	Pet cat = new Pet();
	Pet bird = new Pet();

	System.out.println("...Default...");
	cat.display();

	System.out.println("...Over Loaded...");
	dog.display();

	cat.setName("Smokey");
	cat.setAnimal("Cat");
	cat.setAge(8);

	bird.setName("Angel");
	bird.setAnimal("Bird");
	bird.setAge(20);

	System.out.println("\n...All...");
	dog.display();
	cat.display();
	bird.display();

	System.out.println("\n...Copying bird in dog...");
	bird.copy(dog);
	dog.display();

	System.out.println("\n...String Method...");
	System.out.println(cat.toString());
	
	System.out.println("\n...Comparing dog and bird...");
	System.out.println(dog.compare(bird));
  }
}