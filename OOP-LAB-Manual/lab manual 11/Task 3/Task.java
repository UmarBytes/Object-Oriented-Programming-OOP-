public class Task extends Module{

	private String taskName;
	private String taskDescription;

  	Task(){
		taskName = "null";
		taskDescription = "null";
  }

  	Task(String taskName , String taskDescription){
		this.taskName = taskName;
		this.taskDescription = taskDescription;
  }

  	Task(String taskName , String taskDescription , String moduleName , int projectId , String projectName , String projectLocation){

		super(moduleName , projectId , projectName , projectLocation);
		this.taskName = taskName;
		this.taskDescription = taskDescription;
  }

  	void setTaskName(String taskName){
		this.taskName = taskName;
  }

  	void setTaskDescription(String taskDescription){
		this.taskDescription = taskDescription;
  }

  	String getTaskName(){
		return taskName;
  }

  	String getTaskDescription(){
		return taskDescription;
  }

  	@Override
  	void displayState(){

		super.displayState();
		System.out.println("Task Name : " + getTaskName());
		System.out.println("Task Description : " + getTaskDescription());
  }
}