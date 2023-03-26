import java.util.Scanner;
class Book{

	private int bookId;
	private int pages;
	private double price;

	Book(){
		this.setBookId(0);
		this.setPages(0);
		this.setPrice(0.0);
	}

	Book(int id){
		this.setBookId(id);
	}

	Book(int id , int pages){
		this.setBookId(id);
		this.setPages(pages);
	}

	Book(int pages , double price){
		this.setPages(pages);
		this.setPrice(price);
	}	

	Book(int id , int pages , double price){
		this.setBookId(id);
		this.setPages(pages);
		this.setPrice(price);
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

	void display(){
		
		System.out.println("BookID = " + getBookId());
		System.out.println("Pages = " + getPages());
		System.out.println("Price = " + getPrice());

	}

	boolean isLarger(Book b){
		return this.getPages() > b.getPages();
	}

	boolean isExpensive(Book b){
		return (this.getPrice() - b.getPrice()) > 0.000001;
	}

	void copy(Book b){

		b.setBookId(this.getBookId());
		b.setPages(this.getPages());
		b.setPrice(this.getPrice());
	}

	public String toString(){
		return this.getBookId() + ", " + this.getPages() + ", " + this.getPrice();
	}

	boolean isEqual(Book b){
		return this.getBookId() == b.getBookId() &&
				this.getPages() == b.getPages() &&
				this.getPrice() == b.getPrice();
	}

	Book create(Book b){
		return new Book(this.getBookId() + b.getBookId(),
			this.getPages() + b.getPages(),
			this.getPrice() + b.getPrice());
	}

}