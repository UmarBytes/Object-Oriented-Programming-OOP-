public class RunBookDescription{
  public static void main(String[] args){
	BookDescription book1 = new BookDescription();
	BookDescription book2 = new BookDescription();
	BookDescription book3 = new BookDescription();

	book1.setTitle("The Little Prince");
	book1.setAuthor("Antoine de Saint-Exupery");
	book1.setPublisher("Reynal & Hitchcock");
	book1.setCopiesSold(200000000);

	System.out.println("\n...Book 1...");
	book1.display();

	book2.setTitle("Twilight");
	book2.setAuthor("Stephen Meyer");
	book2.setPublisher("Little, Brown and Company");
	book2.setCopiesSold(100000000);

	System.out.println("\n...Book 2...");
	book2.display();

	book3.setTitle("FAMOUS TRIALS, Cases That Made History");
	book3.setAuthor("Frank McLynn");
	book3.setPublisher("Vineyard Books");
	book3.setCopiesSold(9800500);

	System.out.println("\n...Book 3...");
	book3.display();
  }
}//class