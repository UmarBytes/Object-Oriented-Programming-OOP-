class Course {
	
	String code;
	String name;
	int credit;

	Course(){
		setCode("");
		setName("");
		setCredit(0);
	}

	Course(String c , String n , int cr){
		setCode(c);
		setName(n);
		setCredit(cr);
	}

	Course(Course c){
		this.setCode(c.getCode());
		this.setName(c.getName());
		this.setCredit(c.getCredit());
	}

	void setCode(String c){
		code = c;
	}

	void setName(String n){
		name = n;
	}

	void setCredit(int cr){
		credit = cr;
	}

	String getCode(){
		return code;
	}

	String getName(){
		return name;
	}

	int getCredit(){
		return credit;
	}

	void print(){

		System.out.println("Code : " + getCode());
		System.out.println("Name : " + getName());
		System.out.println("Credits : " + getCredit());
		
	}

	static void print(Course[] c){
		for (int i = 0 ; i < c.length ; i++) {
			c[i].print();
		}
	}

	boolean isEqual(Course c){

		return this.getCode().equals(c.getCode()) &&
		this.getName().equals(c.getName()) &&
		this.getCredit() == c.getCredit();
	}

	static void sort(Course[] c){

		int startScan, index, minIndex;
		Course minValue;

		for (startScan = 0 ; startScan < (c.length-1) ; startScan++)
		{
			minIndex = startScan;
			minValue = c[startScan];

			for(index = startScan + 1 ; index < c.length ; index++)
			{
				if (c[index].getName().compareTo(minValue.getName()) < 0)
				{
					minValue = c[index];
					minIndex = index;
				}
			}
			c[minIndex] = c[startScan];
			c[startScan] = minValue;
		}
	}

    static int linearSearch(Course [] c , String key){
        int index = -1;
        for (int i = 0 ; i < c.length ; ++i) {
        	if (c[i].getCode().equals(key)){
        		index = i;
        	}
        }
        return index;
    }

    static int search (Course[] c , String key){
    	int first; 
	int last; 
	int middle; 
	int position; 
	boolean found; 
		
	first = 0;
	last = c.length - 1;
	position = -1;
	found = false;
		
		while (!found && first <= last) {
			middle = (first + last) / 2;			
			if (c[middle].getName().compareTo(key) == 0) {
				found = true;
				position = middle;
			}
			
			else if (c[middle].getName().compareTo(key) > 0)
			last = middle - 1;
			
			else
			first = middle + 1;
			}
			
			return position;
    		}

	}