class Lab extends Assignment{

	private String specification;

	public Lab(String name , int month , int day , int hour , int minute , String specification){
		super(name , month , day , hour ,  minute , 12.0 , 9.8 , 11.5);
		this.setSpecification(specification);
	}

	public void setSpecification(String specification) {
        	this.specification = specification;
    	}

    	public String getSpecification() {
        	return this.specification;
    	}

    	public String toString(){
    		return "Specification is : " + this.getSpecification() + ", " + super.toString();
    	}
    
 }