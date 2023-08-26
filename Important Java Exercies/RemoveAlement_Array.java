/*
QUESTION: Write a Java program to remove a specific element from an array.
*/
import java.util.Arrays;
public class RemoveAlement_Array{
	public static void main(String[] args){
	int [] Array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	System.out.println("Before Remove element :  "+Arrays.toString(Array));
	int removeIndex = 2;
	for(int i = removeIndex; i < Array.length - 1; i++){
	Array[i] = Array [i+1];	
	}
            System.out.println("After Remove element : "+Arrays.toString(Array));
     }

}