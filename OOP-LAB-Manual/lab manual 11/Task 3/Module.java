public class Module extends Project{

	private String moduleName;

  	Module(){
		moduleName = "null";
  }

  	Module(String moduleName){
		this.moduleName = moduleName;
  }

  	Module(String moduleName , int projectId , String projectName , String projectLocation){
		super(projectId , projectName , projectLocation);
		this.moduleName = moduleName;
  }

  	void setModuleName(String moduleName){
		this.moduleName = moduleName;
  }

  	String getModuleName(){
		return moduleName;
  }

  	@Override
  	void displayState(){
		super.displayState();
		System.out.println("Module Name : " + getModuleName());
  }
}