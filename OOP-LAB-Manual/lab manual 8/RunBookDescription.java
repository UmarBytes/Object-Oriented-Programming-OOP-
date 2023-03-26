public class RunBookDescription{
	public static void main (String[] args){

	BookDescription book1 = new BookDescription();
	BookDescription book2 = new BookDescription("The Little Prince" , "Antoine de Saint-Exupery" , "Reynal & Hitchcock", 200000000);
	BookDescription book3 = new BookDescription("Moon Palace" , "Paul Auster" , "Viking Press" , 1000000000 );
		
		
		book2.setTitle("Three Wishes");
		book2.setAuthor("Liane Moriarty");
		book2.setPublisher("Simon and Schuster");
		book2.setCopiesSold(3000000);

		book3.setTitle("Leaves of Grass");
		book3.setAuthor("Walt Whitman");
		book3.setPublisher("Whitman");
		book3.setCopiesSold(200);

		
		System.out.println("Displaying the details of Book #1 :");
		book1.display();
		System.out.println("\nDisplaying the details of Book #2 :");
		book2.display();
		System.out.println("\nDisplaying the details of Book #3 :");
		book3.display();

		
		book2.copy(book3);

		System.out.println("Calling toString() method of Book #3 :");
		System.out.println(book3.toString());

		

		if(book2.compare(book3)){
			System.out.println("Book #2 and Book #3 are equal.");
		}
		else{
			System.out.println("Book #2 and Book #3 are not equal.");
		}

		if (book1.isNotEqual(book2)){
			System.out.println("Book #1 and Book #2 are not equal.");
		}
		else{
			System.out.println("Book #1 and Book #2 are equal.");
		}

		BookDescription anotherBook = book1.create(book3);
		System.out.println("\nDisplaying the details of newly created BookDescription object :");
		anotherBook.display();

	}
}