interface Name{
	void show();
}
class Test implements Name{
                    public void show(){
		System.out.println("Abstraction by interface");
	}
             public static void main(String[] args){
                                Test t = new Test();
		t.show();
         }
      }