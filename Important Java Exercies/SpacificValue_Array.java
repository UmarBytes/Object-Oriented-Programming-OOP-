public class SpacificValue_Array{
	public static void main(String[] args)
	{
	int [] Array = {1900,1938,1940,1947,1955,1957,1965,1975,1978,1992,2001,2021};
	System.out.println("This is:  "+contains(Array, 1945));
	System.out.println("This is:  "+contains(Array, 1965));
	System.out.println("This is:  "+contains(Array, 1947));
	System.out.println("This is:  "+contains(Array, 1975));
	System.out.println("This is:  "+contains(Array, 2021));
	}
        public static boolean contains(int [] arr, int num)
       {
	for(int i : arr)
	{
	  if(num == i)
	{
	return true;
	}
	}
              return false;	
       }
}