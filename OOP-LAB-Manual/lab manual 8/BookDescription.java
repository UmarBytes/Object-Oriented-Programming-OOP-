class BookDescription{

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;

	BookDescription(){

		this.setTitle("Payam-I-Mashriq");
		this.setAuthor("Dr. Allama Muhammad Iqbal");
		this.setPublisher("Iqbal Academy Pakistan");
		this.setCopiesSold(6000000);
	}

	BookDescription(String t , String a , String p , int c){
		this.setTitle(t);
		this.setAuthor(a);
		this.setPublisher(p);
		this.setCopiesSold(c);
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

		System.out.println("Title : " + getTitle());
		System.out.println("Author : " + getAuthor());
		System.out.println("Publisher : " + getPublisher());
		System.out.println("Copies sold : " + getCopiesSold());
	}

	boolean isMorePopular(BookDescription b){
		return this.getCopiesSold() > b.getCopiesSold();
	}
	
	void copy(BookDescription b){

		b.setTitle(this.getTitle());
		b.setAuthor(this.getAuthor());
		b.setPublisher(this.getPublisher());
		b.setCopiesSold(this.getCopiesSold());
	}

	public String toString(){
		return this.getTitle() + ", " + this.getAuthor() + ", " + this.getPublisher() + ", " + this.getCopiesSold();
	}

	boolean compare(BookDescription b){

		return this.getTitle().equals(b.getTitle()) &&
			this.getAuthor().equals(b.getAuthor()) &&
			this.getPublisher().equals(b.getPublisher()) &&
			this.getCopiesSold() == b.getCopiesSold();
	}

	boolean isNotEqual(BookDescription b){
		return !this.compare(b);
	}

	BookDescription create(BookDescription b){
		return new BookDescription(this.getTitle() + " " + b.getTitle(),
				this.getAuthor() + " " + b.getAuthor(),
				this.getPublisher() + " " + b.getPublisher(),
				this.getCopiesSold() + b.getCopiesSold());
	}

}