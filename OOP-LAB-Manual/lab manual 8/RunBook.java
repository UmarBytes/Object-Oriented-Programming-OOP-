public class RunBook{
	public static void main(String[] args){

		Book politicalScience = new Book(7 , 400);	
		Book urdu = new Book(200 , 20.5);	
		Book english = new Book();
		Book math = new Book(2);	
		Book punjabi = new Book(9 , 600 , 22.8);	
	
		
		System.out.println("Displaying the details of English :");
		english.display();
		System.out.println("\nDisplaying the details of Math :");
		math.display();
		System.out.println("\nDisplaying the details of Political Science :");
		politicalScience.display();
		System.out.println("\nDisplaying the details of Urdu :");
		urdu.display();
		System.out.println("\nDisplaying the details of Punjabi :");
		punjabi.display();

		
		english.setBookId(10);
		english.setPages(550);
		english.setPrice(15.6);

		math.setBookId(15);
		math.setPages(600);
		math.setPrice(14.5);

		
		if (english.isLarger(math)){
			System.out.println("English is larger than Math.");
		}

		
		if (english.isExpensive(math)){
			System.out.println("English is expensive than Math.");
		}

		
		math.copy(english);

		System.out.println("Calling toString() method of English :");
		System.out.println(english.toString());

		if (english.isEqual(math)){
			System.out.println("English and Math are equal.");
		}
		else{
			System.out.println("English and Math are not equal.");
		}

		Book anotherBook = urdu.create(punjabi);
		System.out.println("\nDisplaying the details of newly created book :");
		anotherBook.display();

	}
}