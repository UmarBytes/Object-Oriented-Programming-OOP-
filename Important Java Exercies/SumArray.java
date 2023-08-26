public class SumArray{
	public static void main(String[] args){
	    int [] Numbers = {10,50,45,48,215,87,45,87,254,254,235};
	
	int sum = 0;
	for(int i  : Numbers)
	      sum += i;
	System.out.println("Sum of Array is : " + sum);
	}
}