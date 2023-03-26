public class RunStudent {
	public static void main(String[] args) {

       	final int SIZE = 6;
        Student[] s = new Student[SIZE];

        s[0] = new Student();

        s[1] = new Student(101 , "Ali" , "Akbar" , 2.95);
        s[2] = new Student(167 , "Faraz" , "Amjad" , 3.49);
        s[3] = new Student(292 , "Hamza" , "Akram" , 3.95);
        s[4] = new Student(310 , "Noor" , "Sajjad" , 3.08);
        s[5] = new Student(s[2]);

        System.out.println("Displaying all students :");
        Student.print(s);
        
        if(s[5].isEqual(s[2])){
            System.out.println("\n\nStudent #3 and Student #6 are equal.");
        }
        else{
            System.out.println("\n\nStudent #3 and Student #6 are not equal.");
        }
        
        int keyToSearch = 310;
        
        int index = Student.linearSearch(s , keyToSearch);

        if (index != -1){

            System.out.println("\n\nThe key " + keyToSearch + " is found at index # " + index + ".");
            System.out.println("Displaying the student :");
            s[index].print();
        }
        else{
            System.out.println("\n\nThe key " + keyToSearch + " not found.");
        }
        
        System.out.println("\n\nSorting the student array...");
        Student.sort(s);
        System.out.println("\n\nDisplaying all students after sorting :");
        Student.print(s);
       
        keyToSearch = 292;
        index = Student.search(s , keyToSearch);

        if (index != -1){
            System.out.println("\n\nThe key " + keyToSearch + " is found at index " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + keyToSearch + " not found.");
        }
         
    }
    
}
