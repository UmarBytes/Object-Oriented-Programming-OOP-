import java.util.Scanner;

public class Book{
	private int bookId;
	private int pages;
	private double price;

	public void get(){

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the id of the book : ");
		int id = in.nextInt();

		System.out.print("Enter the pages of the book : ");
		int p = in.nextInt();

		System.out.print("Enter the price of the book : ");
		double pr = in.nextDouble();

		set(id, p, pr);

	}

	public void set(int b, int p, double pr){
		
		setBookId(b);
		setPages(p);
		setPrice(pr);

	}

	public void setBookId(int id){
		bookId = id;
	}

	public void setPages(int p){
		pages = p;
	}

	public void setPrice(double pr){
		price = pr;
	}

	public int getBookId(){
		return bookId;
	}

	public int getPages(){
		return pages;
	}

	public double getPrice(){
		return price;
	}

	public void show(){
		
		System.out.println("BookID = " + getBookId());
		System.out.println("pages = " + getPages());
		System.out.println("price = " + getPrice());

	}

}