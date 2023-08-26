public class Main{
	public static void main(String[] args) {
	System.out.println("Me");
	Main Umar = new Main();
	Birds Sp = new Birds();

	Umar.eat(); Umar.run(); Umar.name(); Sp.fly();
	}

	public void eat(){
		System.out.println("i am eating");
	}
	public void run(){
		System.out.println("i am runing ");
				}
	public void name(){
		System.out.println("My name is Umar");
	}
	}
	class Birds{
		void fly(){
		System.out.println("I am flying");
	}

}
