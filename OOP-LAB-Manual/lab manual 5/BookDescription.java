public class BookDescription{
	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
//-------------------------------------------------------------
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
//--------------------------------------------------------------
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
//----------------------------------------------------------------
  void display(){
	System.out.println("\nBook Title: " + getTitle());
	System.out.println("Book Author: " + getAuthor());
	System.out.println("Book Publisher: " + getPublisher());
	System.out.println("Book Copies Sold: " + getCopiesSold());
  }
}//class