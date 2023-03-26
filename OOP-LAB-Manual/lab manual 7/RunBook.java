public class RunBook{
  public static void main(String[] args){

	Book a = new Book();
	Book b = new Book(10 , 265 , 630);
	
	a.display();
	b.display();

	a.setBookId(14);
	a.setPages(299);
	a.setPrice(530);

	System.out.println("\nAfter changing state\n");
	a.display();
	b.display();
  }
}