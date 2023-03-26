class SkateBoard extends Vehicle{

	private double boardLength;
	private int numberOfWheels;

	public SkateBoard(){
		super("Krooked" , "GONZ");
		this.setBoardLength(35.0);
		this.setNumberOfWheels(4);
	}

	public SkateBoard(double boardLength , int numberOfWheels){
		super("Krooked" , "Shiloh");
		this.setBoardLength(boardLength);
		this.setNumberOfWheels(numberOfWheels);
	}

	public SkateBoard(double boardLength , int numberOfWheels , String brand , String model){
		super(brand , model);
		this.setBoardLength(boardLength);
		this.setNumberOfWheels(numberOfWheels);	
	}

	public void setBoardLength(double boardLength){
		this.boardLength = boardLength;
	}

	public void setNumberOfWheels(int numberOfWheels){
		this.numberOfWheels = numberOfWheels;
	}

	public double getBoardLength(){
		return this.boardLength;
	}

	public int getNumberOfWheels(){
		return this.numberOfWheels;
	}

	public void display(){
		super.display();
		System.out.println("Board length is : " + this.getBoardLength());
		System.out.println("Number of wheels is : " + this.getNumberOfWheels());
	}
 }