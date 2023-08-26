class ThisReturn{
	ThisReturn m1()
	{
	return this;
	}
	public static void main(String[] args){
		ThisReturn td = new ThisReturn();
			td.m1();
        }
}