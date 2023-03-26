public class RunCourse{
	public static void main(String[] args){

	final int SIZE = 6;
	Course[] c = new Course[SIZE];

	c[0] = new Course();
	c[1] = new Course("CS141" , "Environmental Science" , 3);
	c[2] = new Course("CS240" , "OOP" , 5);
	c[3] = new Course("CS238" , "DLD" , 5);
	c[4] = new Course("CS205" , "Composition" , 3);
	c[5] = new Course(c[2]);
		
	System.out.println("Displaying all courses :");
	Course.print(c);
		
	if(c[5].isEqual(c[2])){
            System.out.println("\n\nCourse #6 and Course #3 are equal.");
        }
        else{
            System.out.println("\n\nCourse #6 and Course #3 are not equal.");
        }
		
	Course.sort(c);
	System.out.println("Displaying after sorting :");
	Course.print(c);

	String key = "CS205";
	int index = Course.linearSearch(c , key);

	if(index > 0){
		System.out.println("\n\nThe key " + key + " is found at index # " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + key + " not found.");
        }

	System.out.println("\n\nSortng the Courses array...");
        Course.sort(c);
        System.out.println("\n\nDisplaying all Courses after sorting :");
        Course.print(c);

	key = "Composition";
	int i = Course.search(c , key);

	if(i > 0){
		System.out.println("\n\nThe key " + key + " is found at index # " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + key + " not found.");
        }

	}
}