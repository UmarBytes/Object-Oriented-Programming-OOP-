public class RunPet{
  public static void main(String[] args){
	Pet dog = new Pet();
	Pet cat = new Pet();
	Pet bird = new Pet();

	dog.setName("Milo");
	dog.setAnimal("Dog");
	dog.setAge(10);

	cat.setName("Oscar");
	cat.setAnimal("Cat");
	cat.setAge(6);

	bird.setName("Sunshine");
	bird.setAnimal("Bird");
	bird.setAge(25);

	System.out.println("\nName: " + dog.getName());
	System.out.println("Animal: " + dog.getAnimal());
	System.out.println("Age: " + dog.getAge());

	System.out.println("\nName:" + cat.getName());
	System.out.println("Animal: " + cat.getAnimal());
	System.out.println("Age: " + cat.getAge());

	System.out.println("\nName: " + bird.getName());
	System.out.println("Animal: " + bird.getAnimal());
	System.out.println("Age: " + bird.getAge());
  }
}//class