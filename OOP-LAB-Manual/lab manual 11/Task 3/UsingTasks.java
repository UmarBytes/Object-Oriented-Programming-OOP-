public class UsingTasks{
  public static void main(String[] args){

	Module m = new Module();
	Module m1 = new Module("com.lmnop.mymodule", 4567, "King Mall", "Wapda Town");

	Task t = new Task();
	Task t1 = new Task("abc", "ghsfdtjwndvhcjaknxgg", "com.xyz.mymodule", 5346, "Emporium Mall", "Al Huda");

	System.out.println("\n...Module...");
	m.displayState();
	m1.displayState();

	System.out.println("\n...Task...");
	t.displayState();
	t1.displayState();

	m.setModuleName("com.jhg.mymodule");
	m.setProjectId(365);
	m.setProjectName("Millennium Mall");
	m.setProjectLocation("Karachi");

	t.setTaskName("xyz");
	t.setTaskDescription("skchhcuieownfbjfgifoewop");
	t.setModuleName("com.mno.mymodule");
	t.setProjectId(809);
	t.setProjectName("Mall");
	t.setProjectLocation("Lahore");

	System.out.println("\n...After Changing State...");
	m.displayState();
	t.displayState();
  }
}