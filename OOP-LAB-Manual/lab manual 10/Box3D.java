class Box3D{
	
	double length;
	double width;
	double height;
	String color;

	Box3D(){
		setLength(0.0);
		setWidth(0.0);
		setHeight(0.0);
		setColor("");
	}

	Box3D(double l , double w , double h , String c){
		setLength(l);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}

	Box3D(Box3D b){
		setLength(b.getLength());
		setWidth(b.getWidth());
		setHeight(b.getHeight());
		setColor(b.getColor());
	}

	void setLength(double l){
		length = l;
	}

	void setWidth(double w){
		width = w;
	}

	void setHeight(double h){
		height = h;
	}

	void setColor(String c){
		color = c;
	}

	double getLength(){
		return length;
	}

	double getWidth(){
		return width;
	}

	double getHeight(){
		return height;
	}

	String getColor(){
		return color;
	}

	void print(){

		System.out.println("Length : " + getLength());
		System.out.println("width : " + getWidth());
		System.out.println("Height : " + getHeight());
		System.out.println("Color : " + getColor());
		System.out.println("Area : " + area());
		
	}

	static void print(Box3D[] b){
		for (int i = 0 ; i < b.length ; i++) {
			b[i].print();
		}
	}

	boolean isEqual(Box3D b){

		return this.getLength() == b.getLength() &&
		this.getWidth() == b.getWidth() &&
		this.getHeight() == b.getHeight() &&
		this.getColor().equals(b.getColor());
	}

	double area(){
		return this.getLength() * this.getWidth() * this.getHeight();
	}

	static void sort(Box3D[] b){

		int startScan , index , minIndex;
		Box3D minValue;

		for (startScan = 0; startScan < (b.length-1); startScan++){
	 	
			minIndex = startScan;
			minValue = b[startScan];

			for(index = startScan + 1 ; index < b.length ; index++)
			{
				if (b[index].area() - minValue.area() < 0.000001)
				{
					minValue = b[index];
					minIndex = index;
				}
			}
			b[minIndex] = b[startScan];
			b[startScan] = minValue;
		}
	}

    static int linearSearch(Box3D [] b , String key){

        int index = -1;

        for (int i = 0 ; i < b.length ; i++) {
        	if (b[i].getColor().equals(key)){
        		index = i;
        	}
        }
        return index;
    }

    static void search(Box3D[] b, double key){

    	int count = 0;
        for (int i = 0 ; i < b.length ; i++) {
        	if (b[i].area() >= key){
        		b[i].print();
        	}
        }

        if(count > 0){
        	System.out.println("No Object Found.");
        }
    }

}