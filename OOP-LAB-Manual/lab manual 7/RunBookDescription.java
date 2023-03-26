public class RunBookDescription{
  public static void main(String[] args){

	BookDescription def = new BookDescription();
	BookDescription overL = new BookDescription("NoTitle", "NoAuthr", "NoPublisher", 00);
	BookDescription book1 = new BookDescription();
	BookDescription book2 = new BookDescription();

	book1.setTitle("The Little Prince");
	book1.setAuthor("Antoine de Saint-Exupery");
	book1.setPublisher("Reynal & Hitchcock");
	book1.setCopiesSold(200000000);

	System.out.println("\n...Book 1...");
	book1.display();

	book2.setTitle("Moon Palace");
	book2.setAuthor("Paul Auster");
	book2.setPublisher("Viking Press");
	book2.setCopiesSold(1000000000);

	System.out.println("\n...Book 2...");
	book2.display();

	System.out.println("\n...Default...");
	def.display();

	System.out.println("\n...OverLoaded...");
	overL.display();

	System.out.println("\n...is More Popular Method...");
	System.out.println(book1.isMorePopular(book2));

	System.out.println("\n...Copying book2 in book1...");
	book2.copy(book1);
	book1.display();

	System.out.println("\n...String Method...");
	System.out.println(book2.toString());
	
	System.out.println("\n...Comparing book1 and book2...");
	System.out.println(book2.compare(book1));
  }
}