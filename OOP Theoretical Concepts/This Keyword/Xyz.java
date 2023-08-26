class Name{
	int i; 	//instanse veriable
	void setValue(int i)
	{			//Agr ham instance veribale or local veribale ka same name rakh deen to output "0" ho gi
		this.i = i;		//q k int ki defolt value "0" hoti ha
	}
	void show()
	{
	System.out.println(i);
	}
}
class Xyz{
	public static void main(String[] args){
		Name obj = new Name();
			obj.setValue(101);
			obj.show();
	}
}
