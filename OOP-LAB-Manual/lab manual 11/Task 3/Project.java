public class Project{

	private int projectId;
	private String projectName;
	private String projectLocation;

  	Project(){
		projectId = 0;
		projectName = "null";
		projectLocation = "null";
  }

  	Project(int projectId , String projectName , String projectLocation){
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
  }

  	void setProjectId(int projectId){
		this.projectId = projectId;
  }

  	void setProjectName(String projectName){
		this.projectName = projectName;
  }

  	void setProjectLocation(String projectLocation){
		this.projectLocation = projectLocation;
  }

  	int getProjectId(){
		return projectId;
  }

  	String getProjectName(){
		return projectName;
  }

  	String getProjectLocation(){
		return projectLocation;
  }

  	void displayState(){

		System.out.println("\nProject Id : " + getProjectId());
		System.out.println("Project Name : " + getProjectName());
		System.out.println("Project Location : " + getProjectLocation());
  }
}