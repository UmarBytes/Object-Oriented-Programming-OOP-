public class RunBook{
  public static void main(String[] args){
	Book maths = new Book();
	Book english = new Book();

	System.out.println("\nDetails of Maths Book");
	maths.get();
	System.out.println("\nDetails of English Book");
	english.get();

	maths.show();
	english.show();

	maths.setBookId(2);
	maths.setPages(320);
	maths.setPrice(150.75);

	System.out.println("\nMaths BookId: " + maths.getBookId());
	System.out.println("Maths Pages: " + maths.getPages());
	System.out.println("Maths Price: " + maths.getPrice());

	System.out.println("\nThe details of the costliest book are...");

	double m = maths.getPrice();
	double e = english.getPrice();
	if(m > e)
	{
		System.out.println("\nMaths BookId: " + maths.getBookId());
		System.out.println("Maths Pages: " + maths.getPages());
		System.out.println("Maths Price: " + maths.getPrice());
	}
	else
	{
		System.out.println("\nEnglish BookId: " + english.getBookId());
		System.out.println("English Pages: " + english.getPages());
		System.out.println("English Price: " + english.getPrice());
	}
  }
}