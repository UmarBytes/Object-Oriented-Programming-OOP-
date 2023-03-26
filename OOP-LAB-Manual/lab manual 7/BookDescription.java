public class BookDescription{

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;

  	BookDescription(){
		setTitle("null");
		setAuthor("null");
		setPublisher("null");
		setCopiesSold(0);
  }

 	 BookDescription(String t, String a, String p, int cs){
		setTitle(t);
		setAuthor(a);
		setPublisher(p);
		setCopiesSold(cs);
  }

 	 void setTitle(String t){
		title = t;
  }

 	 void setAuthor(String a){
		author = a;
  }

 	 void setPublisher(String p){
		publisher = p;
  }

 	 void setCopiesSold(int c){
		copiesSold = c;
  }

 	 String getTitle(){
		return title;
  }

 	 String getAuthor(){
		return author;
  }

  	String getPublisher(){
		return publisher;
  }

  	int getCopiesSold(){
		return copiesSold;
  }

 	 void display(){
		System.out.println("\nBook Title: " + getTitle());
		System.out.println("Book Author: " + getAuthor());
		System.out.println("Book Publisher: " + getPublisher());
		System.out.println("Book Copies Sold: " + getCopiesSold());
  }

 	 boolean isMorePopular(BookDescription b){
		if((b.getCopiesSold()) < this.copiesSold)
			return false;
	return true;
  }

 	 void copy(BookDescription b){
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublisher(publisher);
		b.setCopiesSold(copiesSold);
  }

  	public String toString(){
		String how = "\"" + getTitle() + ", " + getAuthor() + " , " + getPublisher() + ", " + getCopiesSold() + "\"";
		return how;
  }

  	boolean compare(BookDescription b){
		if(b.getTitle().equals(this.title) && b.getAuthor().equals(this.author) && b.getPublisher().equals(this.publisher) && b.getCopiesSold() == (this.copiesSold))

		return true;
	return false;
  }
}