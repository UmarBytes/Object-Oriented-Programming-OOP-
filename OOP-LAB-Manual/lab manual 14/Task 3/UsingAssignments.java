class UsingAssignments{
	public static void main(String[] args) {

		Lab lab = new Lab("Assignment #1" , 3 , 20 , 12 , 35 , "Write detail note on volcanic eruption");
		Project project = new Project("Assignment #2" , 4 , 22 , 18 , 55 , "Write any three environmental movements on word" , "Document.txt" );

		final int SIZE = 2;

		Assignment[] assignments = new Assignment[SIZE];
		assignments[0] = lab;
		assignments[1] = project;
		Assignment.showAssignments(assignments);
	}
 }