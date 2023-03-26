import java.util.Scanner;
import java.io.*;
public class FileIOFirstRepeatingNumberLab3{
  	public static void main(String[] args) throws IOException{
  
	File file = new File("input-3-3.txt");
	Scanner input = new Scanner(file);

	PrintWriter output = new PrintWriter("output3-3.txt");
	
	int[] array = new int[input.nextInt()];

	for(int i = 0; i < array.length; i++)

		array[i] = Integer.parseInt(input.next());
	
	int num = getFirstRepeatingNumber(array);

	if(num != -1){

		output.print("1st Repeating Number is: " + num);
	}
	else if(num == -1)
		output.print("All Elements Are Unique.");

	System.out.println("Data written to the file named \"output-3-3.txt\".");

	input.close();
	output.close();
	
	}


  	public static int getFirstRepeatingNumber(int[] array){

	for(int i=0; i<array.length; i++){
	
		for(int j=0;j<array.length; j++){
		
			if(i !=j){
			
				if(array[i]==array[j])
				return array[i];
			}
		}
	}

	return -1;
  	}
		}