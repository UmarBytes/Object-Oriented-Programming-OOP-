interface Multipale_inheritance_interface{
	void show();
       }
interface NO2{
	void display();
    }
class Test implements Multipale_inheritance_interface,NO2{
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
           public static void main(String[] args){
	Test t = new Test();
		t.show();
		t.display();   
        }
 }