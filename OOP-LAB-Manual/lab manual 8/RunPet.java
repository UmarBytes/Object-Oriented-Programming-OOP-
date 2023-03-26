public class RunPet{
	public static void main(String[] args){

		
		Pet dog = new Pet();
		Pet cat = new Pet("Smokey" , "Cat" , 7);
		Pet bird = new Pet("Angel" , "Bird" , 20);

		
		cat.setName("Milo");
		cat.setAnimal("Billi");
		cat.setAge(4);

		bird.setName("Buddy");
		bird.setAnimal("Parrot");
		bird.setAge(6);

		
		System.out.println("Details for the dog.");
		dog.display();

		System.out.println("\nDetails for the cat.");
		cat.display();

		System.out.println("\nDetails for the bird.");
		bird.display();

		
		cat.copy(dog);

		System.out.println("Calling toString() method of Cat:");
		System.out.println(dog.toString());

		

		if(cat.compare(dog)){
			System.out.println("Cat and Dog are equal.");
		}
		else{
			System.out.println("Cat and Dog are not equal.");
		}

		if (dog.isNotEqual(bird)){
			System.out.println("Dog and Bird are not equal.");
		}
		else{
			System.out.println("Dog and Bird are equal.");
		}

		Pet anotherPet = bird.create(cat);
		System.out.println("\nDisplaying the details of newly created pet :");
		anotherPet.display();

	}
}