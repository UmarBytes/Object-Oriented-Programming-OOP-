class Assignment{

	private String name;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private double score;
	private double totalPoints;
	private double totalWeight;

    	public Assignment(String name , int month , int day , int hour , int minute , double score , double totalPoints , double totalWeight){

    		this.setName(name);
    		this.setMonth(month);
    		this.setDay(day);
    		this.setHour(hour);
    		this.setMinute(minute);
    		this.setScore(score);
    		this.setTotalPoints(totalPoints);
    		this.setTotalWeight(totalWeight);
    	}

    	public void setName(String name){
        	this.name = name;
    	}

    	public void setMonth(int month){
        	this.month = month;
    	}

    	public void setDay(int day){
        	this.day = day;
    	}

    	public void setHour(int hour){
        	this.hour = hour;
    	}

    	public void setMinute(int minute){
        	this.minute = minute;
    	}

    	public void setScore(double score){
        	this.score = score;
    	}

    	public void setTotalPoints(double totalPoints){
        	this.totalPoints = totalPoints;
    	}

    	public void setTotalWeight(double totalWeight){
        	this.totalWeight = totalWeight;
    	}

    	public String getName(){
        	return this.name;
    	}

   	public int getMonth(){
        	return this.month;
    	}

    	public int getDay(){
        	return this.day;
    	}

    	public int getHour(){
        	return this.hour;
    	}

    	public int getMinute(){
        	return this.minute;
    	}

    	public double getScore(){
        	return this.score;
    	}

    	public double getTotalPoints(){
        	return this.totalPoints;
    	}

    	public double getTotalWeight(){
        	return this.totalWeight;
    	}

    	public String toString(){
    		return "Name is : " + this.getName() + ", Month is : " + this.getMonth()
    			+ ", Day is : " + this.getDay()  + ", Hour is : " + this.getHour()
    			 + ", Minute is : " + this.getMinute()  + ", Score is : " + this.getScore()
    			  + ", Total points is : " + this.getTotalPoints()
    			   + ", Total weight is : " + this.getTotalWeight();
    	}

    	public static void showAssignments(Assignment[] assignments){
    		for (int i = 0 ; i < assignments.length ; i++){
    		System.out.println(assignments[i]);
    	}
    }

 }