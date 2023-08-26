/*
QUESTION:  Write a Java program to copy an array by iterating the array
*/
import java.util.Arrays;
public class ArrayCopy_Array{
	public static void main (String[] args){
	int [] Array = {10,20,30,40,50,60,70,80,90,100};
	int [] new_Array = new int[10];
	System.out.println("Orignal Array :  "+ Arrays.toString(Array));
	for(int i = 0; i < Array.length; i++){
	new_Array[i] = Array[i]; 
	}
	System.out.println("Coppyed Array :  "+ Arrays.toString(Array));
         }
}