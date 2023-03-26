class Project extends Assignment{

	private String specification;
    	private String dataFile;

	public Project(String name , int month , int day , int hour , int minute , String specification , String dataFile){
		super(name , month , day , hour , minute , 13.3 , 18.5 , 16.6);
                this.setSpecification(specification);
		this.setDataFile(dataFile);
	}

	public void setSpecification(String specification) {
        	this.specification = specification;
    	}

    	public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    	}

    	public String getSpecification() {
        return this.specification;
    	}

    	public String getDataFile() {
        	return this.dataFile;
    	}

    	public String toString(){
    		return "Specification is : " + this.getSpecification() + ", Data file is : " + this.getDataFile() + ", " + super.toString();
    	}
    
 }