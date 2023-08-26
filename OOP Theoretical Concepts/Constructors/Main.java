class Constructor_class{

    Constructor_class(String name, int id){
        System.out.println("The name of First employee is :"+name);
        System.out.println("The ID of First employee is : "+id);
    }
    Constructor_class(String name, int id, int Salary){
        System.out.println("\n*************************************\n");
        System.out.println("The name of First employee is : "+name);
        System.out.println("The ID of First employee is : "+id);
        System.out.println("The ID of First employee is : "+Salary);
    }
}
public class Main{

    public static void main(String[] args) {
        Constructor_class obj = new Constructor_class("Salman",101);
        Constructor_class obj1 = new Constructor_class("Wali Sultan",102,10000000);

    }
}
