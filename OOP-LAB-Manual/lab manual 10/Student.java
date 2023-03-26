public class Student {

    	int id;
    	String firstName;
    	String lastName;
    	double gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    Student(){

        setId(1);
        setFirstName("");
        setLastName("");
        setGpa(0.0);
    }
    
    Student(int i , String fName , String lName , double gpa){

        setId(i);
        setFirstName(fName);
        setLastName(lName);
        setGpa(gpa);
    }
    
    Student(Student s){

        setId(s.getId());
        setFirstName(s.getFirstName());
        setLastName(s.getLastName());
        setGpa(s.getGpa());
    }

    void print(){

        System.out.println("Id : " + this.getId());
        System.out.println("First name : " + this.getFirstName());
        System.out.println("Last name : " + this.getLastName());
        System.out.println("GPA : " + this.getGpa());
    }
    
    static void print(Student[] s){
        for (int i = 0 ; i < s.length ; i++) {
            s[i].print();
        }
    }
    
    boolean isEqual(Student s){
        return this.getId() == s.getId();
    }
    
    boolean isGPALesser(Student s){
        return this.getGpa() < s.getGpa();
    }
    
    static void sort(Student[] s){
        
    }
    
    static int linearSearch(Student[] s , int key){

        for (int i = 0 ; i < s.length ; i++) {
            if(s[i].getId() == key){
                return i;
            }
        }
        return -1;
    }
    
    static int search(Student[] s , int key){

        int first; 
        int last; 
        int middle; 
        int position; 
        boolean found; 
        
        first = 0;
        last = s.length - 1;
        position = -1;
        found = false;
        
        while (!found && first <= last) {
            
            middle = (first + last) / 2;
            
            if (s[middle].getId() == key) {
                found = true;
                position = middle;
            }
           
            else if (s[middle].getId() > key)
            last = middle - 1;
            
            else
            first = middle + 1;
            }
            
            
            return position;
    }
    
}