public class Book{

	private int bookId;
	private int pages;
	private double price;

  	Book(){

	setBookId(0);
	setPages(0);
	setPrice(0.0);
  }

  	Book(int id){
		setBookId(id);
  }

 	 Book(int id, int pg){
		setBookId(id);
		setPages(pg);
  }

  	Book(int id , int pg , double pr){

		setBookId(id);
		setPages(pg);
		setPrice(pr);
  }

  	void display(){

		System.out.println("Book id : " + bookId);
		System.out.println("Pages : " + pages);
		System.out.println("Price : " + price);
  }

  	void setBookId(int id){
		bookId = id;
  }

  	void setPages(int p){
		pages = p;
  }

 	 void setPrice(double pr){
		price = pr;
  }

  	int getBookId(){
		return bookId;
  }

  	int getPages(){
		return pages;
  }

 	 double getPrice(){
		return price;
  }

  	boolean isLarger(Book b){
		return pages > b.getPages();
  }

 	 boolean isExpensive(Book b){
		return price > b.getPrice();
  }

 	 void copy(Book b){
		b.setBookId(bookId);
		b.setPages(pages);
		b.setPrice(price);
  }

  	public String toString(){
		String how = "\"" + getBookId() + ", " + getPages() + " , " + getPrice() + "\"";
		return how;
  }
}