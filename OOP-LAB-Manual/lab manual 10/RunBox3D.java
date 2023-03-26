public class RunBox3D{
	public static void main(String[] args){

	final int SIZE = 6;
	Box3D[] b = new Box3D[SIZE];

	b[0] = new Box3D();
	b[1] = new Box3D(2.6 , 4.6 , 3.4 , "Yellow");
	b[2] = new Box3D(5.8 , 6.7 , 5.8 , "Black");
	b[3] = new Box3D(5.9 , 4.9 , 6.7 , "Green");
	b[4] = new Box3D(3.5 , 7.6 , 4.0 , "White");
	b[5] = new Box3D(b[4]);

	System.out.println("Displaying all Boxes :");
	Box3D.print(b);

	if(b[5].isEqual(b[4])){
            System.out.println("\n\nBox #6 and Box #5 are equal.");
        }
        else{
            System.out.println("\n\nbox #6 and Box #5 are not equal.");
        }

	String keyToSearch = "Black";
	int index = Box3D.linearSearch(b , keyToSearch);

        if (index != -1){
            System.out.println("\n\nThe key " + keyToSearch + " is found at index # " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + keyToSearch + " not found.");
        }

        System.out.println("\n\nSortng the Box3D array...");
        Box3D.sort(b);
        System.out.println("\n\nDisplaying all Boxes after sorting :");
        Box3D.print(b);

	double key = 40.0;
        System.out.println("\n\nBoxes which have area greater than or equal to " + key);
	    Box3D.search(b , key);        

	}
}